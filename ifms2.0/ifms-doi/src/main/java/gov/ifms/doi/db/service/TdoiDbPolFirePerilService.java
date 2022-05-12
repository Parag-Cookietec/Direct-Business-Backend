package gov.ifms.doi.db.service;

import java.util.List;

import gov.ifms.common.base.PagebleDTO;
import gov.ifms.common.pagination.PageDetails;
import gov.ifms.doi.db.dto.TdoiDbPolFirePerilDTO;

public interface TdoiDbPolFirePerilService {
	TdoiDbPolFirePerilDTO saveOrUpdate(TdoiDbPolFirePerilDTO dto);

	PagebleDTO<TdoiDbPolFirePerilDTO> findAllByCriteria(PageDetails pageDetails);

	List<TdoiDbPolFirePerilDTO> findAllByStatus(TdoiDbPolFirePerilDTO dto);

	List<TdoiDbPolFirePerilDTO> softDeleteById(Long id);
}
