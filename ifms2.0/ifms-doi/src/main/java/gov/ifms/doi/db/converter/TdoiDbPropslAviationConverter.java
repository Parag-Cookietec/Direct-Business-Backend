package gov.ifms.doi.db.converter;

import java.util.ArrayList;

import java.util.List;

import gov.ifms.doi.db.dto.TdoiDbProposalDTO;
import gov.ifms.doi.db.entity.*;
import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Component;

import gov.ifms.doi.db.dto.TdoiDbPropslAviationDTO;

@Component
public class TdoiDbPropslAviationConverter{

	public TdoiDbPropslAviationEntity toEntity(TdoiDbPropslAviationDTO dto) {
		TdoiDbPropslAviationEntity entity = new TdoiDbPropslAviationEntity();
		BeanUtils.copyProperties(dto, entity);
		if(entity.getPropAviationId()==null){
			if(entity.getTdoiDbProposal()==null){
				TdoiDbProposalEntity tdoiDbProposal = new TdoiDbProposalEntity();
				BeanUtils.copyProperties(dto.getTdoiDbProposal(),tdoiDbProposal);
				entity.setTdoiDbProposal(tdoiDbProposal);
			}

			//AircraftDetails
			entity.setTdoiDbPropAviationAircrafts(new ArrayList<>());
			dto.getTdoiDbPropAviationAircrafts().forEach(aDt->{
				TdoiDbPropAviationAircraftEntity propAviationAircraft = new TdoiDbPropAviationAircraftEntity();
				BeanUtils.copyProperties(aDt,propAviationAircraft);
				entity.addTdoiDbPropAviationAircraft(propAviationAircraft);
			});

			//RiDtls
			entity.setTdoiDbPropAviationRiDtls(new ArrayList<>());
			dto.getTdoiDbPropAviationRiDtls().forEach(ri->{
				TdoiDbPropAviationRiDtlEntity tdoiDbPropAviationRiDtl = new TdoiDbPropAviationRiDtlEntity();
				BeanUtils.copyProperties(ri,tdoiDbPropAviationRiDtl);
				entity.addTdoiDbPropAviationRiDtl(tdoiDbPropAviationRiDtl);
			});

		}
		return entity;
	}

	public List<TdoiDbPropslAviationDTO> toDtoListFromEntityList(List<TdoiDbPropslAviationEntity> entityList) {
		List<TdoiDbPropslAviationDTO> dtoList = new ArrayList<>();
		for (TdoiDbPropslAviationEntity entity : entityList) {
			//TODO: Modify for work-flow
			entity.setTdoiDbPropslAviationWfs(null);
			entity.getTdoiDbProposal().setTdoiDbProposlWfs(null);
			dtoList.add(toDtoFromEntity(entity));
		}
	return dtoList;
	}


	public TdoiDbPropslAviationDTO toDtoFromEntity(TdoiDbPropslAviationEntity entity) {
		TdoiDbPropslAviationDTO dto=new TdoiDbPropslAviationDTO();
		if(dto.getTdoiDbProposal()==null){
			TdoiDbProposalDTO proposalDTO = new TdoiDbProposalDTO();
			BeanUtils.copyProperties(entity.getTdoiDbProposal(),proposalDTO);
			dto.setTdoiDbProposal(proposalDTO);
		}
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}


}

