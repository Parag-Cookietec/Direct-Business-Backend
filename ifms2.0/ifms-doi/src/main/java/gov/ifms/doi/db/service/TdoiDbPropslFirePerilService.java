package gov.ifms.doi.db.service;

import gov.ifms.common.base.PagebleDTO;
import gov.ifms.common.pagination.PageDetails;
import gov.ifms.doi.db.dto.TdoiDbPropslFirePerilDTO;

import java.util.List;

public interface TdoiDbPropslFirePerilService {
	public TdoiDbPropslFirePerilDTO saveOrUpdate(TdoiDbPropslFirePerilDTO dto);

	public List<TdoiDbPropslFirePerilDTO> findAllByCriteria(TdoiDbPropslFirePerilDTO dto);

	public List<TdoiDbPropslFirePerilDTO> findAllByStatus(TdoiDbPropslFirePerilDTO dto);

	public List<TdoiDbPropslFirePerilDTO> softDeleteById(Long id);

    PagebleDTO<TdoiDbPropslFirePerilDTO> findByProposalNumber(PageDetails pageDetails);
}
