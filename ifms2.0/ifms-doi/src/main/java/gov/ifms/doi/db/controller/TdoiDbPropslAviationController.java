package gov.ifms.doi.db.controller;

import gov.ifms.common.constant.MsgConstant;
import gov.ifms.common.dto.ApiResponse;
import gov.ifms.common.logging.annotation.Trace;
import gov.ifms.common.util.ResponseUtil;
import gov.ifms.doi.db.dto.TdoiDbPropslAviationDTO;
import gov.ifms.doi.db.service.TdoiDbPropslAviationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static gov.ifms.doi.db.constant.DoiDBUriConstants.DOI_DB_PROP_AVIATION_ENTRY;
import static gov.ifms.doi.jpa.constant.DoiJPAUrlConstants.CONTENT_TYPE_APP_JSON;
import static gov.ifms.doi.jpa.constant.DoiJPAUrlConstants.DOI_JPA_DB_BASE_URL;


@RestController
@RequestMapping(DOI_JPA_DB_BASE_URL)
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TdoiDbPropslAviationController{

	@Autowired
	TdoiDbPropslAviationService service;


	@Trace
	@PostMapping(value =DOI_DB_PROP_AVIATION_ENTRY , produces = CONTENT_TYPE_APP_JSON, consumes = CONTENT_TYPE_APP_JSON)
	public ResponseEntity<ApiResponse> saveOrUpdate(@RequestBody TdoiDbPropslAviationDTO dto) {
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.DPSHEET_CREATE_MSG, service.saveOrUpdate(dto));
	}

/*
	@Trace
	@PostMapping(value = DOI_JPA_DB_PROPSLAVIATION_LISTING, produces = CONTENT_TYPE_APP_JSON, consumes = CONTENT_TYPE_APP_JSON)
	public ResponseEntity<ApiResponse> getAll(@RequestBody TdoiDbPropslAviationDTO dto) {
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.BUDGET_MSG_FETCH, service.findAllByCriteria(dto));
	}


	@Trace
	@DeleteMapping(value = DOI_JPA_DB_PROPSLAVIATION_DELETE, produces = CONTENT_TYPE_APP_JSON)
	public ResponseEntity<ApiResponse> softDeleteById(@RequestParam(name = "id") Long id) {
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.BUDGET_MSG_DELETE, service.softDeleteById(id));
	}


	@Trace
	@PostMapping(value = DOI_JPA_DB_PROPSLAVIATION_LISTING_BY_STATUS, produces = CONTENT_TYPE_APP_JSON, consumes = CONTENT_TYPE_APP_JSON)
	public ResponseEntity<ApiResponse> getAllByStatus(@RequestBody TdoiDbPropslAviationDTO dto) {
		return ResponseUtil.getResponse(HttpStatus.OK, MsgConstant.BUDGET_MSG_FETCH, service.findAllByStatus(dto));
	}
	*/

}

