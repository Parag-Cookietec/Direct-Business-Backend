package gov.ifms.doi.db.converter;

import java.util.ArrayList;

import java.util.List;

import gov.ifms.doi.db.dto.TdoiDbProposalDTO;
import gov.ifms.doi.db.entity.*;
import org.springframework.beans.BeanUtils;

import org.springframework.stereotype.Component;

import gov.ifms.doi.db.dto.TdoiDbPolAviationDTO;

@Component
public class TdoiDbPolAviationConverter{

	public TdoiDbPolAviationEntity toEntity(TdoiDbPolAviationDTO dto) {
		TdoiDbPolAviationEntity entity = new TdoiDbPolAviationEntity();
		BeanUtils.copyProperties(dto, entity);
		if(entity.getPolAviationId()==null){
			if(entity.getTdoiDbProposal()==null){
				TdoiDbProposalEntity tdoiDbProposal = new TdoiDbProposalEntity();
				BeanUtils.copyProperties(dto.getTdoiDbProposal(),tdoiDbProposal);
				entity.setTdoiDbProposal(tdoiDbProposal);
			}
		}

		//AircraftDetails
		entity.setTdoiDbPolAviationAircrafts(new ArrayList<>());
		dto.getTdoiDbPolAviationAircrafts().forEach(aDt->{
			TdoiDbPolAviationAircraftEntity polAviationAircraft = new TdoiDbPolAviationAircraftEntity();
			BeanUtils.copyProperties(aDt,polAviationAircraft);
			entity.addTdoiDbPolAviationAircraft(polAviationAircraft);
		});

		//RiDtls
		entity.setTdoiDbPolAviationRiDtls(new ArrayList<>());
		dto.getTdoiDbPolAviationRiDtls().forEach(ri->{
			TdoiDbPolAviationRiDtlEntity tdoiDbPropAviationRiDtl = new TdoiDbPolAviationRiDtlEntity();
			BeanUtils.copyProperties(ri,tdoiDbPropAviationRiDtl);
			entity.addTdoiDbPolAviationRiDtl(tdoiDbPropAviationRiDtl);
		});

		return entity;
	}


	public List<TdoiDbPolAviationDTO> toDtoListFromEntityList(List<TdoiDbPolAviationEntity> entityList) {
		List<TdoiDbPolAviationDTO> dtoList = new ArrayList<>();
		for (TdoiDbPolAviationEntity entity : entityList) {
			//TODO: Modify for work-flow
			entity.setTdoiDbPolAviationWfs(null);
			entity.getTdoiDbProposal().setTdoiDbProposlWfs(null);
			dtoList.add(toDtoFromEntity(entity));
		}
	return dtoList;
	}


	public TdoiDbPolAviationDTO toDtoFromEntity(TdoiDbPolAviationEntity entity) {
		TdoiDbPolAviationDTO dto=new TdoiDbPolAviationDTO();
		if(dto.getTdoiDbProposal()==null){
			TdoiDbProposalDTO proposalDTO = new TdoiDbProposalDTO();
			BeanUtils.copyProperties(entity.getTdoiDbProposal(),proposalDTO);
			dto.setTdoiDbProposal(proposalDTO);
		}
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}


}

