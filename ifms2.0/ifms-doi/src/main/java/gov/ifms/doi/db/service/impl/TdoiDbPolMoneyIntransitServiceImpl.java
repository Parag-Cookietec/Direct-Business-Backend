package gov.ifms.doi.db.service.impl;

import java.util.Date;
import java.util.List;

import gov.ifms.doi.db.constant.DoiDBConstants;
import gov.ifms.doi.db.entity.TdoiDbPolMoneyIntransitEntity;
import gov.ifms.doi.db.repository.TdoiDbProposalRepository;
import gov.ifms.doi.db.utility.DbUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gov.ifms.doi.db.converter.TdoiDbPolMoneyIntransitConverter;
import gov.ifms.doi.db.dto.TdoiDbPolMoneyIntransitDTO;
import gov.ifms.doi.db.repository.TdoiDbPolMoneyIntransitRepository;
import gov.ifms.doi.db.service.TdoiDbPolMoneyIntransitService;
import org.thymeleaf.util.StringUtils;

@Service
public class TdoiDbPolMoneyIntransitServiceImpl implements TdoiDbPolMoneyIntransitService {

	@Autowired
	TdoiDbPolMoneyIntransitRepository repository;

	@Autowired
	TdoiDbProposalRepository dbProposalRepository;

	@Autowired
	TdoiDbPolMoneyIntransitConverter converter;

	@Autowired
	DbUtility dbUtility;

	@Override
	public TdoiDbPolMoneyIntransitDTO saveOrUpdate(TdoiDbPolMoneyIntransitDTO dto) {
		TdoiDbPolMoneyIntransitEntity moneyIntransitEntity = converter.toEntity(dto);
		String policyNumber = dbUtility.getPolicyNumber(DoiDBConstants.DOI_DB_MIT_POLICY_NUMBER);

		if(moneyIntransitEntity.getTdoiDbProposal()!=null
				&& moneyIntransitEntity.getTdoiDbProposal().getDbProposalId()==null){
			moneyIntransitEntity.getTdoiDbProposal().setPolicyNo(policyNumber);
			moneyIntransitEntity.setTdoiDbProposal(dbProposalRepository.save(moneyIntransitEntity.getTdoiDbProposal()));
		}

		//Property Insurance details
		if(moneyIntransitEntity.getTdoiDbPolMitInsurances()!=null
				&& !moneyIntransitEntity.getTdoiDbPolMitInsurances().isEmpty()){
			moneyIntransitEntity.getTdoiDbPolMitInsurances().forEach(mit->mit.setTdoiDbPolMoneyIntransit(moneyIntransitEntity));
		}

		//FireRiDtls
		if(moneyIntransitEntity.getTdoiDbPolMitRiDtls()!=null && !moneyIntransitEntity.getTdoiDbPolMitRiDtls().isEmpty()){
			moneyIntransitEntity.getTdoiDbPolMitRiDtls().forEach(o -> o.setTdoiDbPolMoneyIntransit(moneyIntransitEntity));
		}

		if(StringUtils.isEmpty(dto.getReferenceNo())){
			moneyIntransitEntity.setReferenceNo(policyNumber);
			moneyIntransitEntity.setReferenceDt(new Date());
		}
		return converter.toDtoFromEntity(repository.save(moneyIntransitEntity));
	}


	@Override
	public List<TdoiDbPolMoneyIntransitDTO> findAllByCriteria(TdoiDbPolMoneyIntransitDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAll());
	}


	@Override
	public List<TdoiDbPolMoneyIntransitDTO> findAllByStatus(TdoiDbPolMoneyIntransitDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


	@Override
	public List<TdoiDbPolMoneyIntransitDTO> softDeleteById(Long id) {
			repository.softDeleteById(id);
			return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


}

