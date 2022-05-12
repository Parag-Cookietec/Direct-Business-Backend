package gov.ifms.doi.db.converter;

import java.util.ArrayList;

import java.util.List;

import gov.ifms.doi.db.dto.TdoiDbProposalDTO;
import gov.ifms.doi.db.entity.*;
import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Component;

import gov.ifms.doi.db.dto.TdoiDbPolFirePerilDTO;

@Component
public class TdoiDbPolFirePerilConverter{

	public TdoiDbPolFirePerilEntity toEntity(TdoiDbPolFirePerilDTO dto) {
		TdoiDbPolFirePerilEntity entity = new TdoiDbPolFirePerilEntity();
		BeanUtils.copyProperties(dto, entity);
		if(entity.getPolFirePerilId() == null){
			if(entity.getTdoiDbProposal()==null){
				TdoiDbProposalEntity tdoiDbProposal = new TdoiDbProposalEntity();
				BeanUtils.copyProperties(dto.getTdoiDbProposal(),tdoiDbProposal);
				entity.setTdoiDbProposal(tdoiDbProposal);
			}

			//BuildingVals
			entity.setTdoiDbPolFireBuildingVals(new ArrayList<>());
			dto.getTdoiDbPolFireBuildingVals().forEach(b->{
				TdoiDbPolFireBuildingValEntity buildingValEntity = new TdoiDbPolFireBuildingValEntity();
				BeanUtils.copyProperties(b,buildingValEntity);
				entity.addTdoiDbPolFireBuildingVal(buildingValEntity);
			});

			//Past3Policy
			entity.setTdoiDbPolFirePastPolicies(new ArrayList<>());
			dto.getTdoiDbPolFirePastPolicies().forEach(p->{
				TdoiDbPolFirePastPolicyEntity pastPolicyEntity = new TdoiDbPolFirePastPolicyEntity();
				BeanUtils.copyProperties(p,pastPolicyEntity);
				entity.addTdoiDbPolFirePastPolicy(pastPolicyEntity);
			});

			//FireRisk
			entity.setTdoiDbFireRiskLocs(new ArrayList<>());
			dto.getTdoiDbPolFireRiskLocs().forEach(r->{
				TdoiDbPolFireRiskLocEntity fireRiskLocEntity = new TdoiDbPolFireRiskLocEntity();
				BeanUtils.copyProperties(r,fireRiskLocEntity);
				entity.addTdoiDbPolFireRiskLocEntity(fireRiskLocEntity);
			});

			//FireSumInsured
			entity.setTdoiDbPolFireSumInsureds(new ArrayList<>());
			dto.getTdoiDbPolFireSumInsureds().forEach(sum->{
				TdoiDbPolFireSumInsuredEntity fireSumInsuredEntity = new TdoiDbPolFireSumInsuredEntity();
				BeanUtils.copyProperties(sum,fireSumInsuredEntity);
				entity.addTdoiDbPolFireSumInsured(fireSumInsuredEntity);
			});

			//FireRiDtls
			entity.setTdoiDbPolFireRiDtls(new ArrayList<>());
			dto.getTdoiDbPolFireRiDtls().forEach(ri->{
				TdoiDbPolFireRiDtlEntity fireRiDtlEntity = new TdoiDbPolFireRiDtlEntity();
				BeanUtils.copyProperties(ri,fireRiDtlEntity);
				entity.addTdoiDbPolFireRiDtl(fireRiDtlEntity);
			});
		}
		return entity;
	}


	public List<TdoiDbPolFirePerilDTO> toDtoListFromEntityList(List<TdoiDbPolFirePerilEntity> entityList) {
		List<TdoiDbPolFirePerilDTO> dtoList = new ArrayList<>();
		for (TdoiDbPolFirePerilEntity entity : entityList) {
			//TODO: Modify later for work-flow
			entity.setTdoiDbPolFireWfs(null);
			entity.getTdoiDbProposal().setTdoiDbProposlWfs(null);
			dtoList.add(toDtoFromEntity(entity));
		}
	return dtoList;
	}


	public TdoiDbPolFirePerilDTO toDtoFromEntity(TdoiDbPolFirePerilEntity entity) {
		TdoiDbPolFirePerilDTO dto=new TdoiDbPolFirePerilDTO();
		BeanUtils.copyProperties(entity, dto);
		if(dto.getTdoiDbProposal()==null){
			TdoiDbProposalDTO proposalDTO = new TdoiDbProposalDTO();
			BeanUtils.copyProperties(entity.getTdoiDbProposal(),proposalDTO);
			dto.setTdoiDbProposal(proposalDTO);
		}
		return dto;
	}

}

