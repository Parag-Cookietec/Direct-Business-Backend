package gov.ifms.doi.db.service.impl;

import java.util.Date;
import java.util.List;

import gov.ifms.doi.db.constant.DoiDBConstants;
import gov.ifms.doi.db.entity.TdoiDbPropMoneyIntransitEntity;
import gov.ifms.doi.db.repository.TdoiDbProposalRepository;
import gov.ifms.doi.db.utility.DbUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gov.ifms.doi.db.converter.TdoiDbPropMoneyIntransitConverter;
import gov.ifms.doi.db.dto.TdoiDbPropMoneyIntransitDTO;
import gov.ifms.doi.db.repository.TdoiDbPropMoneyIntransitRepository;
import gov.ifms.doi.db.service.TdoiDbPropMoneyIntransitService;
import org.thymeleaf.util.StringUtils;

@Service
public class TdoiDbPropMoneyIntransitServiceImpl implements TdoiDbPropMoneyIntransitService {

	@Autowired
	TdoiDbPropMoneyIntransitRepository repository;

	@Autowired
	TdoiDbProposalRepository dbProposalRepository;

	@Autowired
	TdoiDbPropMoneyIntransitConverter converter;

	@Autowired
	DbUtility dbUtility;

	@Override
	public TdoiDbPropMoneyIntransitDTO saveOrUpdate(TdoiDbPropMoneyIntransitDTO dto) {
		TdoiDbPropMoneyIntransitEntity moneyIntransitEntity = converter.toEntity(dto);
		String proposalNo = dbUtility.getReferenceNumber(DoiDBConstants.DOI_DB_MITP_REFERENCE_NUMBER, DoiDBConstants.DOI_DB_MITP_REFERENCE_NUMBER_URI);

		if(moneyIntransitEntity.getTdoiDbProposal()!=null
				&& moneyIntransitEntity.getTdoiDbProposal().getDbProposalId()==null){
			moneyIntransitEntity.getTdoiDbProposal().setProposalNo(proposalNo);
			moneyIntransitEntity.setTdoiDbProposal(dbProposalRepository.save(moneyIntransitEntity.getTdoiDbProposal()));
		}

		//Property Insurance details
		if(moneyIntransitEntity.getTdoiDbPropMitInsurances()!=null
				&& !moneyIntransitEntity.getTdoiDbPropMitInsurances().isEmpty()){
			moneyIntransitEntity.getTdoiDbPropMitInsurances().forEach(mit->mit.setTdoiDbPropMoneyIntransit(moneyIntransitEntity));
		}

		//FireRiDtls
		if(moneyIntransitEntity.getTdoiDbPropMitRiDtls()!=null && !moneyIntransitEntity.getTdoiDbPropMitRiDtls().isEmpty()){
			moneyIntransitEntity.getTdoiDbPropMitRiDtls().forEach(o -> o.setTdoiDbPropMoneyIntransit(moneyIntransitEntity));
		}

		if(StringUtils.isEmpty(dto.getReferenceNo())){
			moneyIntransitEntity.setReferenceNo(proposalNo);
			moneyIntransitEntity.setReferenceDt(new Date());
		}
		return converter.toDtoFromEntity(repository.save(moneyIntransitEntity));
	}


	@Override
	public List<TdoiDbPropMoneyIntransitDTO> findAllByCriteria(TdoiDbPropMoneyIntransitDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAll());
	}


	@Override
	public List<TdoiDbPropMoneyIntransitDTO> findAllByStatus(TdoiDbPropMoneyIntransitDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


	@Override
	public List<TdoiDbPropMoneyIntransitDTO> softDeleteById(Long id) {
			repository.softDeleteById(id);
			return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}
}

