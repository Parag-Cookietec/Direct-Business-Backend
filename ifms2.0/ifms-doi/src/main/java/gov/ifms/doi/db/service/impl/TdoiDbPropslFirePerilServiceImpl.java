package gov.ifms.doi.db.service.impl;

import gov.ifms.common.base.PagebleDTO;
import gov.ifms.common.pagination.PageDetails;
import gov.ifms.common.pagination.SearchCriteria;
import gov.ifms.common.pagination.SpecificationImpl;
import gov.ifms.doi.db.constant.DoiDBConstants;
import gov.ifms.doi.db.converter.TdoiDbPropslFirePerilConverter;
import gov.ifms.doi.db.dto.TdoiDbPropslFirePerilDTO;
import gov.ifms.doi.db.entity.TdoiDbPropslFirePerilEntity;
import gov.ifms.doi.db.repository.TdoiDbProposalRepository;
import gov.ifms.doi.db.repository.TdoiDbPropslFirePerilRepository;
import gov.ifms.doi.db.service.TdoiDbPropslFirePerilService;
import gov.ifms.doi.db.utility.DbUtility;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class TdoiDbPropslFirePerilServiceImpl implements TdoiDbPropslFirePerilService {

	@Autowired
	TdoiDbPropslFirePerilRepository repository;

	@Autowired
	TdoiDbPropslFirePerilConverter converter;

	@Autowired
	TdoiDbProposalRepository dbProposalRepository;

	@Autowired
	DbUtility dbUtility;

	@Override
	@Transactional
	public TdoiDbPropslFirePerilDTO saveOrUpdate(TdoiDbPropslFirePerilDTO dto) {
		TdoiDbPropslFirePerilEntity firePerilEntity = converter.toEntity(dto);
		String proposalNo = dbUtility.getReferenceNumber(DoiDBConstants.DOI_DB_PFSFPP_REFERENCE_NUMBER,
				DoiDBConstants.DOI_DB_PFSFPP_REFERENCE_NUMBER_URI);
		if(firePerilEntity.getTdoiDbProposal()!=null
				&& firePerilEntity.getTdoiDbProposal().getDbProposalId()==null){
			firePerilEntity.getTdoiDbProposal().setProposalNo(proposalNo);
			firePerilEntity.setTdoiDbProposal(dbProposalRepository.save(firePerilEntity.getTdoiDbProposal()));
		}
		//BuildingVal
		if(firePerilEntity.getTdoiDbFireBuildingVals()!=null
				&& !firePerilEntity.getTdoiDbFireBuildingVals().isEmpty()){
			firePerilEntity.getTdoiDbFireBuildingVals().forEach(o -> {
				o.setTdoiDbProposal(firePerilEntity.getTdoiDbProposal());
				o.setTdoiDbPropslFirePeril(firePerilEntity);
			});
		}

		//PastPolicies
		if(firePerilEntity.getTdoiDbFirePastPolicies()!=null && !firePerilEntity.getTdoiDbFirePastPolicies().isEmpty()){
			firePerilEntity.getTdoiDbFirePastPolicies().forEach(o -> {
				o.setTdoiDbProposal(firePerilEntity.getTdoiDbProposal());
				o.setTdoiDbPropslFirePeril(firePerilEntity);
			});
		}

		//FireRiskLocs
		if(firePerilEntity.getTdoiDbFireRiskLocs()!=null && !firePerilEntity.getTdoiDbFireRiskLocs().isEmpty()){
			firePerilEntity.getTdoiDbFireRiskLocs().forEach(o -> {
				o.setTdoiDbProposal(firePerilEntity.getTdoiDbProposal());
				o.setTdoiDbPropslFirePeril(firePerilEntity);
			});
		}

		//FireSumInsured
		if(firePerilEntity.getTdoiDbFireSumInsureds()!=null && !firePerilEntity.getTdoiDbFireSumInsureds().isEmpty()){
			firePerilEntity.getTdoiDbFireSumInsureds().forEach(o -> {
				o.setTdoiDbProposal(firePerilEntity.getTdoiDbProposal());
				o.setTdoiDbPropslFirePeril(firePerilEntity);
			});
		}

		//FireRiDtls
		if(firePerilEntity.getTdoiDbPropFireRiDtls()!=null && !firePerilEntity.getTdoiDbPropFireRiDtls().isEmpty()){
			firePerilEntity.getTdoiDbPropFireRiDtls().forEach(o -> {
				o.setTdoiDbPropslFirePeril(firePerilEntity);
			});
		}
		if (StringUtils.isEmpty(dto.getReferenceNo())) {
			firePerilEntity.setReferenceNo(proposalNo);
			firePerilEntity.setReferenceDt(new Date());
		}
		return converter.toDtoFromEntity(repository.save(firePerilEntity));
	}

	@Override
	public PagebleDTO<TdoiDbPropslFirePerilDTO> findByProposalNumber(PageDetails pageDetails) {
		PageRequest pageRequest = null;
		SearchCriteria searchCriteria = new SearchCriteria();
		SpecificationImpl<TdoiDbPropslFirePerilEntity> specImpl = new SpecificationImpl<>();
		pageRequest = pageDetails.getPageDetails(pageDetails);
		Specification<TdoiDbPropslFirePerilEntity> dataSpec = searchCriteria.getSpecificationDetails(specImpl,pageDetails.getJsonArr());
		Page<TdoiDbPropslFirePerilEntity> page = repository.findAll(dataSpec,pageRequest);
		return new PagebleDTO<>(page.getSize(),page.getTotalPages(),page.getTotalElements(),
				converter.toDtoListFromEntityList(page.getContent()));
	}

	@Override
	public List<TdoiDbPropslFirePerilDTO> findAllByCriteria(TdoiDbPropslFirePerilDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAll());
	}


	@Override
	public List<TdoiDbPropslFirePerilDTO> findAllByStatus(TdoiDbPropslFirePerilDTO dto) {
		return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


	@Override
	public List<TdoiDbPropslFirePerilDTO> softDeleteById(Long id) {
			repository.softDeleteById(id);
			return converter.toDtoListFromEntityList(repository.findAllByStatus());
	}


}

