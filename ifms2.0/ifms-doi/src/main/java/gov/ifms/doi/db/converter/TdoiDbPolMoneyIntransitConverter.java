package gov.ifms.doi.db.converter;

import java.util.ArrayList;

import java.util.List;

import gov.ifms.doi.db.dto.TdoiDbProposalDTO;
import gov.ifms.doi.db.entity.*;
import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Component;

import gov.ifms.doi.db.dto.TdoiDbPolMoneyIntransitDTO;

@Component
public class TdoiDbPolMoneyIntransitConverter{

	public TdoiDbPolMoneyIntransitEntity toEntity(TdoiDbPolMoneyIntransitDTO dto) {
		TdoiDbPolMoneyIntransitEntity entity = new TdoiDbPolMoneyIntransitEntity();
		BeanUtils.copyProperties(dto, entity);
		if(entity.getPolMoneyIntransId()==null){
			if(entity.getTdoiDbProposal()==null){
				TdoiDbProposalEntity tdoiDbProposal = new TdoiDbProposalEntity();
				BeanUtils.copyProperties(dto.getTdoiDbProposal(),tdoiDbProposal);
				entity.setTdoiDbProposal(tdoiDbProposal);
			}

			//Property Insurance details
			entity.setTdoiDbPolMitInsurances(new ArrayList<>());
			dto.getTdoiDbPolMitInsurances().forEach(in->{
				TdoiDbPolMitInsuranceEntity polMitInsurance = new TdoiDbPolMitInsuranceEntity();
				BeanUtils.copyProperties(in,polMitInsurance);
				entity.addTdoiDbPolMitInsurance(polMitInsurance);
			});

			//FireRiDtls
			entity.setTdoiDbPolMitRiDtls(new ArrayList<>());
			dto.getTdoiDbPolMitRiDtls().forEach(ri->{
				TdoiDbPolMitRiDtlEntity mitRiDtlEntity = new TdoiDbPolMitRiDtlEntity();
				BeanUtils.copyProperties(ri,mitRiDtlEntity);
				entity.addTdoiDbPolMitRiDtl(mitRiDtlEntity);
			});
		}
		return entity;
	}


	public List<TdoiDbPolMoneyIntransitDTO> toDtoListFromEntityList(List<TdoiDbPolMoneyIntransitEntity> entityList) {
		List<TdoiDbPolMoneyIntransitDTO> dtoList = new ArrayList<>();
		for (TdoiDbPolMoneyIntransitEntity entity : entityList) {
			//TODO: Modify for work-flow
			entity.setTdoiDbPolMitWfs(null);
			entity.getTdoiDbProposal().setTdoiDbProposlWfs(null);
			dtoList.add(toDtoFromEntity(entity));
		}
	return dtoList;
	}


	public TdoiDbPolMoneyIntransitDTO toDtoFromEntity(TdoiDbPolMoneyIntransitEntity entity) {
		TdoiDbPolMoneyIntransitDTO dto=new TdoiDbPolMoneyIntransitDTO();
		if(dto.getTdoiDbProposal()==null){
			TdoiDbProposalDTO proposalDTO = new TdoiDbProposalDTO();
			BeanUtils.copyProperties(entity.getTdoiDbProposal(),proposalDTO);
			dto.setTdoiDbProposal(proposalDTO);
		}
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
}

