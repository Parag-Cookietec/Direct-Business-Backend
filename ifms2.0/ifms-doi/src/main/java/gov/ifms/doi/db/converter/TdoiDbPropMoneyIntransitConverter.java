package gov.ifms.doi.db.converter;

import java.util.ArrayList;

import java.util.List;

import gov.ifms.doi.db.dto.TdoiDbProposalDTO;
import gov.ifms.doi.db.entity.*;
import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Component;

import gov.ifms.doi.db.dto.TdoiDbPropMoneyIntransitDTO;

@Component
public class TdoiDbPropMoneyIntransitConverter{

	public TdoiDbPropMoneyIntransitEntity toEntity(TdoiDbPropMoneyIntransitDTO dto) {
		TdoiDbPropMoneyIntransitEntity entity = new TdoiDbPropMoneyIntransitEntity();
		BeanUtils.copyProperties(dto, entity);
		if(entity.getPropMoneyIntransId()==null){
			if(entity.getTdoiDbProposal()==null){
				TdoiDbProposalEntity tdoiDbProposal = new TdoiDbProposalEntity();
				BeanUtils.copyProperties(dto.getTdoiDbProposal(),tdoiDbProposal);
				entity.setTdoiDbProposal(tdoiDbProposal);
			}

			//Property Insurance details
			entity.setTdoiDbPropMitInsurances(new ArrayList<>());
			dto.getTdoiDbPropMitInsurances().forEach(in->{
				TdoiDbPropMitInsuranceEntity propMitInsurance = new TdoiDbPropMitInsuranceEntity();
				BeanUtils.copyProperties(in,propMitInsurance);
				entity.addTdoiDbPropMitInsurance(propMitInsurance);
			});

			//FireRiDtls
			entity.setTdoiDbPropMitRiDtls(new ArrayList<>());
			dto.getTdoiDbPropMitRiDtls().forEach(ri->{
				TdoiDbPropMitRiDtlEntity mitRiDtlEntity = new TdoiDbPropMitRiDtlEntity();
				BeanUtils.copyProperties(ri,mitRiDtlEntity);
				entity.addTdoiDbPropMitRiDtl(mitRiDtlEntity);
			});
		}
		return entity;
	}


	public List<TdoiDbPropMoneyIntransitDTO> toDtoListFromEntityList(List<TdoiDbPropMoneyIntransitEntity> entityList) {
		List<TdoiDbPropMoneyIntransitDTO> dtoList = new ArrayList<>();
		for (TdoiDbPropMoneyIntransitEntity entity : entityList) {
			//TODO: Modify for work-flow
			entity.setTdoiDbPropMitWfs(null);
			entity.getTdoiDbProposal().setTdoiDbProposlWfs(null);
			dtoList.add(toDtoFromEntity(entity));
		}
	return dtoList;
	}


	public TdoiDbPropMoneyIntransitDTO toDtoFromEntity(TdoiDbPropMoneyIntransitEntity entity) {
		TdoiDbPropMoneyIntransitDTO dto=new TdoiDbPropMoneyIntransitDTO();
		if(dto.getTdoiDbProposal()==null){
			TdoiDbProposalDTO proposalDTO = new TdoiDbProposalDTO();
			BeanUtils.copyProperties(entity.getTdoiDbProposal(),proposalDTO);
			dto.setTdoiDbProposal(proposalDTO);
		}
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}


}

