package gov.ifms.doi.db.service.impl;

import java.util.Date;
import java.util.List;

import gov.ifms.doi.db.constant.DoiDBConstants;
import gov.ifms.doi.db.entity.TdoiDbPropslAviationEntity;
import gov.ifms.doi.db.repository.TdoiDbProposalRepository;
import gov.ifms.doi.db.utility.DbUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gov.ifms.doi.db.converter.TdoiDbPropslAviationConverter;
import gov.ifms.doi.db.dto.TdoiDbPropslAviationDTO;
import gov.ifms.doi.db.repository.TdoiDbPropslAviationRepository;
import gov.ifms.doi.db.service.TdoiDbPropslAviationService;
import org.thymeleaf.util.StringUtils;

@Service
public class TdoiDbPropslAviationServiceImpl implements TdoiDbPropslAviationService {

	@Autowired
	TdoiDbPropslAviationRepository repository;

	@Autowired
	TdoiDbProposalRepository dbProposalRepository;

	@Autowired
	TdoiDbPropslAviationConverter converter;

	@Autowired
	DbUtility dbUtility;

	@Override
	public TdoiDbPropslAviationDTO saveOrUpdate(TdoiDbPropslAviationDTO dto) {
		TdoiDbPropslAviationEntity aviationEntity = converter.toEntity(dto);
		String proposalNo = dbUtility.getReferenceNumber(DoiDBConstants.DOI_DB_PROP_AVIATION_REFERENCE_NUMBER, DoiDBConstants.DOI_DB_PROP_AVIATION_REFERENCE_NUMBER_URI);

		if(aviationEntity.getTdoiDbProposal()!=null
				&& aviationEntity.getTdoiDbProposal().getDbProposalId()==null){
			aviationEntity.getTdoiDbProposal().setProposalNo(proposalNo);
			aviationEntity.setTdoiDbProposal(dbProposalRepository.save(aviationEntity.getTdoiDbProposal()));
		}

		// Aircraft details
		if(aviationEntity.getTdoiDbPropAviationAircrafts()!=null
			&& !aviationEntity.getTdoiDbPropAviationAircrafts().isEmpty()){
			aviationEntity.getTdoiDbPropAviationAircrafts().forEach(a->a.setTdoiDbPropslAviation(aviationEntity));
		}

		//Ri Details
		if(aviationEntity.getTdoiDbPropAviationRiDtls()!=null &&
				!aviationEntity.getTdoiDbPropAviationRiDtls().isEmpty()){
			aviationEntity.getTdoiDbPropAviationRiDtls().forEach(r->r.setTdoiDbPropslAviation(aviationEntity));
		}

		if(StringUtils.isEmpty(dto.getReferenceNo())){
			aviationEntity.setReferenceNo(proposalNo);
			aviationEntity.setReferenceDt(new Date());
		}
		return converter.toDtoFromEntity(repository.save(aviationEntity));
	}


	@Override
	public List<TdoiDbPropslAviationDTO> findAllByCriteria(TdoiDbPropslAviationDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAll());
	}


	@Override
	public List<TdoiDbPropslAviationDTO> findAllByStatus(TdoiDbPropslAviationDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


	@Override
	public List<TdoiDbPropslAviationDTO> softDeleteById(Long id) {
			repository.softDeleteById(id);
			return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


}

