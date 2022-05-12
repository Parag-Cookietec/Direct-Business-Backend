package gov.ifms.doi.db.service;

import java.util.List;
import gov.ifms.doi.db.dto.TdoiDbPolMoneyIntransitDTO;

public interface TdoiDbPolMoneyIntransitService {
	TdoiDbPolMoneyIntransitDTO saveOrUpdate(TdoiDbPolMoneyIntransitDTO dto);
	List<TdoiDbPolMoneyIntransitDTO> findAllByCriteria(TdoiDbPolMoneyIntransitDTO dto);

	List<TdoiDbPolMoneyIntransitDTO> findAllByStatus(TdoiDbPolMoneyIntransitDTO dto);

	List<TdoiDbPolMoneyIntransitDTO> softDeleteById(Long id);
}
