package gov.ifms.doi.db.service.impl;

import java.util.Date;
import java.util.List;

import gov.ifms.common.base.PagebleDTO;
import gov.ifms.common.pagination.PageDetails;
import gov.ifms.common.pagination.SearchCriteria;
import gov.ifms.common.pagination.SpecificationImpl;
import gov.ifms.doi.db.constant.DoiDBConstants;
import gov.ifms.doi.db.entity.TdoiDbPolFirePerilEntity;
import gov.ifms.doi.db.repository.TdoiDbProposalRepository;
import gov.ifms.doi.db.utility.DbUtility;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import gov.ifms.doi.db.converter.TdoiDbPolFirePerilConverter;
import gov.ifms.doi.db.dto.TdoiDbPolFirePerilDTO;
import gov.ifms.doi.db.repository.TdoiDbPolFirePerilRepository;
import gov.ifms.doi.db.service.TdoiDbPolFirePerilService;

@Service
public class TdoiDbPolFirePerilServiceImpl implements TdoiDbPolFirePerilService {

	@Autowired
	TdoiDbPolFirePerilRepository repository;

	@Autowired
	TdoiDbPolFirePerilConverter converter;

	@Autowired
	TdoiDbProposalRepository dbProposalRepository;

	@Autowired
	DbUtility dbUtility;

	@Override
	public TdoiDbPolFirePerilDTO saveOrUpdate(TdoiDbPolFirePerilDTO dto) {
		TdoiDbPolFirePerilEntity firePerilEntity = converter.toEntity(dto);
		String policyNumber = dbUtility.getPolicyNumber(DoiDBConstants.DOI_DB_SFPP_POLICY_NUMBER);
		if(firePerilEntity.getTdoiDbProposal()!=null
				&& firePerilEntity.getTdoiDbProposal().getDbProposalId()==null){
			firePerilEntity.getTdoiDbProposal().setPolicyNo(policyNumber);
			firePerilEntity.setTdoiDbProposal(dbProposalRepository.save(firePerilEntity.getTdoiDbProposal()));
		}

		//BuildingVal
		if(firePerilEntity.getTdoiDbPolFireBuildingVals()!=null
				&& !firePerilEntity.getTdoiDbPolFireBuildingVals().isEmpty()){
			firePerilEntity.getTdoiDbPolFireBuildingVals().forEach(o -> {
				o.setTdoiDbProposal(firePerilEntity.getTdoiDbProposal());
				o.setTdoiDbPolFirePeril(firePerilEntity);
			});
		}

		//PastPolicies
		if(firePerilEntity.getTdoiDbPolFirePastPolicies()!=null && !firePerilEntity.getTdoiDbPolFirePastPolicies().isEmpty()){
			firePerilEntity.getTdoiDbPolFirePastPolicies().forEach(o -> {
				o.setTdoiDbProposal(firePerilEntity.getTdoiDbProposal());
				o.setTdoiDbPolFirePeril(firePerilEntity);
			});
		}

		//FireRiskLocs
		if(firePerilEntity.getTdoiDbFireRiskLocs()!=null && !firePerilEntity.getTdoiDbFireRiskLocs().isEmpty()){
			firePerilEntity.getTdoiDbFireRiskLocs().forEach(o -> {
				o.setTdoiDbProposal(firePerilEntity.getTdoiDbProposal());
				o.setTdoiDbPolFirePeril(firePerilEntity);
			});
		}

		//FireSumInsured
		if(firePerilEntity.getTdoiDbPolFireSumInsureds()!=null && !firePerilEntity.getTdoiDbPolFireSumInsureds().isEmpty()){
			firePerilEntity.getTdoiDbPolFireSumInsureds().forEach(o -> {
				o.setTdoiDbProposal(firePerilEntity.getTdoiDbProposal());
				o.setTdoiDbPolFirePeril(firePerilEntity);
			});
		}

		//FireRiDtls
		if(firePerilEntity.getTdoiDbPolFireRiDtls()!=null && !firePerilEntity.getTdoiDbPolFireRiDtls().isEmpty()){
			firePerilEntity.getTdoiDbPolFireRiDtls().forEach(o -> {
				o.setTdoiDbPolFirePeril(firePerilEntity);
			});
		}
		if (StringUtils.isEmpty(dto.getReferenceNo())) {
			firePerilEntity.setReferenceNo(policyNumber);
			firePerilEntity.setReferenceDt(new Date());
		}

		return converter.toDtoFromEntity(repository.save(firePerilEntity));
	}

	@Override
	public PagebleDTO<TdoiDbPolFirePerilDTO> findAllByCriteria(PageDetails pageDetails) {
		PageRequest pageRequest = null;
		SearchCriteria searchCriteria = new SearchCriteria();
		SpecificationImpl<TdoiDbPolFirePerilEntity> specImpl = new SpecificationImpl<>();
		pageRequest = pageDetails.getPageDetails(pageDetails);
		Specification<TdoiDbPolFirePerilEntity> dataSpec = searchCriteria.getSpecificationDetails(specImpl,pageDetails.getJsonArr());
		Page<TdoiDbPolFirePerilEntity> page = repository.findAll(dataSpec,pageRequest);
		return new PagebleDTO<>(page.getSize(),page.getTotalPages(),page.getTotalElements(),
				converter.toDtoListFromEntityList(page.getContent()));
	}

	@Override
	public List<TdoiDbPolFirePerilDTO> findAllByStatus(TdoiDbPolFirePerilDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


	@Override
	public List<TdoiDbPolFirePerilDTO> softDeleteById(Long id) {
			repository.softDeleteById(id);
			return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


}

