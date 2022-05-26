package gov.ifms.doi.db.service;

import java.util.List;
import gov.ifms.doi.db.dto.TdoiDbPropslAviationDTO;

public interface TdoiDbPropslAviationService {
	TdoiDbPropslAviationDTO saveOrUpdate(TdoiDbPropslAviationDTO dto);

	List<TdoiDbPropslAviationDTO> findAllByCriteria(TdoiDbPropslAviationDTO dto);

	List<TdoiDbPropslAviationDTO> findAllByStatus(TdoiDbPropslAviationDTO dto);

	List<TdoiDbPropslAviationDTO> softDeleteById(Long id);
}
