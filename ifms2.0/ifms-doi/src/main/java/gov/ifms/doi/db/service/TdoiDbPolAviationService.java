package gov.ifms.doi.db.service;

import java.util.List;
import gov.ifms.doi.db.dto.TdoiDbPolAviationDTO;

public interface TdoiDbPolAviationService {
	TdoiDbPolAviationDTO saveOrUpdate(TdoiDbPolAviationDTO dto);

	List<TdoiDbPolAviationDTO> findAllByCriteria(TdoiDbPolAviationDTO dto);

	List<TdoiDbPolAviationDTO> findAllByStatus(TdoiDbPolAviationDTO dto);

	List<TdoiDbPolAviationDTO> softDeleteById(Long id);

	TdoiDbPolAviationDTO addAviationPolicy(TdoiDbPolAviationDTO dto);
}
