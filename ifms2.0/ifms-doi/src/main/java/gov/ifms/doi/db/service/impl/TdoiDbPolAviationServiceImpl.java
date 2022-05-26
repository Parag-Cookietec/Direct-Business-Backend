package gov.ifms.doi.db.service.impl;

import java.util.Date;
import java.util.List;

import gov.ifms.doi.db.constant.DoiDBConstants;
import gov.ifms.doi.db.entity.TdoiDbPolAviationEntity;
import gov.ifms.doi.db.repository.TdoiDbProposalRepository;
import gov.ifms.doi.db.utility.DbUtility;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gov.ifms.doi.db.converter.TdoiDbPolAviationConverter;
import gov.ifms.doi.db.dto.TdoiDbPolAviationDTO;
import gov.ifms.doi.db.repository.TdoiDbPolAviationRepository;
import gov.ifms.doi.db.service.TdoiDbPolAviationService;

@Service
public class TdoiDbPolAviationServiceImpl implements TdoiDbPolAviationService {

	@Autowired
	TdoiDbPolAviationRepository repository;

	@Autowired
	TdoiDbProposalRepository dbProposalRepository;

	@Autowired
	TdoiDbPolAviationConverter converter;

	@Autowired
	DbUtility dbUtility;

	@Override
	public TdoiDbPolAviationDTO saveOrUpdate(TdoiDbPolAviationDTO dto) {
		TdoiDbPolAviationEntity aviationEntity = converter.toEntity(dto);
		String policyNumber = dbUtility.getPolicyNumber(DoiDBConstants.DOI_DB_AP_POLICY_NUMBER);
		if(aviationEntity.getTdoiDbProposal()!=null
				&& aviationEntity.getTdoiDbProposal().getDbProposalId()==null){
			aviationEntity.setTdoiDbProposal(dbProposalRepository.save(aviationEntity.getTdoiDbProposal()));
		}

		// Aircraft details
		if(aviationEntity.getTdoiDbPolAviationAircrafts()!=null
				&& !aviationEntity.getTdoiDbPolAviationAircrafts().isEmpty()){
			aviationEntity.getTdoiDbPolAviationAircrafts().forEach(a->a.setTdoiDbPolAviation(aviationEntity));
		}

		//Ri Details
		if(aviationEntity.getTdoiDbPolAviationRiDtls()!=null &&
				!aviationEntity.getTdoiDbPolAviationRiDtls().isEmpty()){
			aviationEntity.getTdoiDbPolAviationRiDtls().forEach(r->r.setTdoiDbPolAviation(aviationEntity));
		}

		if (StringUtils.isEmpty(dto.getReferenceNo())) {
			aviationEntity.setReferenceNo(policyNumber);
			aviationEntity.setReferenceDt(new Date());
		}
		return converter.toDtoFromEntity(repository.save(aviationEntity));
	}


	@Override
	public List<TdoiDbPolAviationDTO> findAllByCriteria(TdoiDbPolAviationDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAll());
	}


	@Override
	public List<TdoiDbPolAviationDTO> findAllByStatus(TdoiDbPolAviationDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


	@Override
	public List<TdoiDbPolAviationDTO> softDeleteById(Long id) {
			repository.softDeleteById(id);
			return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}

	@Override
	public TdoiDbPolAviationDTO addAviationPolicy(TdoiDbPolAviationDTO dto) {
		repository.save(converter.toEntity(dto));
		return dto;
	}


}

