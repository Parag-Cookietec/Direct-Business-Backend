package gov.ifms.common.util;

import gov.ifms.common.constant.MsgConstant;

public enum ErrorResponse {
	RECORD_NOT_FOUND(1000, MsgConstant.RECORD_NOT_FOUND),
	PLEASE_UPLOAD_ATTACHMENT(1000, MsgConstant.PLEASE_UPLOAD_ATTACHMENT),
	PLEASE_ADD_CHECKLIST(1000, MsgConstant.PLEASE_ADD_CHECKLIST),
	PLEASE_ADD_FORMC1(1000, MsgConstant.PLEASE_ADD_FORMC1),
	PLEASE_ADD_CSS_DETAILS(1000, MsgConstant.PLEASE_ADD_CSS_DETAILS),
	PLEASE_FILL_DEMAND_DETAILS(1000, MsgConstant.BUDGET_SUPPL_DEMAND_DATA_EMPTY),
	ERA_RBD_ENTRY_NOT_INITIATED(1000, MsgConstant.ERROR_ERA_RBD_ENTRY_NOT_INITIATED),
	DUPLICATE_ROWS_FOUND(1001, MsgConstant.DUPLICATE_ROWS_FOUND),
	REFERENCE_NOT_EXISTS(1002, MsgConstant.REFERENCE_NOT_EXISTS),
	INVALID_JSON_FORMAT(1003, MsgConstant.INVALID_JSON_FORMAT),
	ERROR_WHILE_FATCHING(1004, MsgConstant.ERROR_WHILE_FATCHING),
	ERROR_WHILE_CREATE(1005, MsgConstant.ERROR_WHILE_CREATE), ERROR_WHILE_UPDATE(1006, MsgConstant.ERROR_WHILE_UPDATE),
	ERROR_WHILE_UPDATE_ACTIVESTATUS(1007, MsgConstant.ERROR_WHILE_UPDATE_ACTIVESTATUS),
	ERROR_OCCURRED_WHILE_GENERATE_PRINT(1007, MsgConstant.BUDGET_ERROR_OCCURRED_WHILE_GENERATE_PRINT),
	UNKNOWN_ERROR_OCCURED(1008, MsgConstant.UNKNOWN_ERROR_OCCURED),
	JSON_PARSING_ERROR(1009, MsgConstant.JSON_PARSING_ERROR),
	UNSUPPORTED_MEDIA_TYPE(1010, MsgConstant.UNSUPPORTED_MEDIA_TYPE),
	JSON_RESPONSE_ERROR(1011, MsgConstant.JSON_RESPONSE_ERROR),
	ERROR_WHILE_DELETE(1012, MsgConstant.ERROR_WHILE_DELETE), INVALID_URL_FOUND(1012, MsgConstant.INVALID_URL_FOUND),
	ERROR_WHILE_DOWNLOAD(1013, MsgConstant.ERROR_WHILE_DOWNLOAD),
	ERROR_WHILE_SAVEFILE(1014, MsgConstant.ERROR_WHILE_SAVEFILE), FILE_NOT_FOUND(1015, MsgConstant.FILE_NOT_FOUND),
	VALIDATIONS_FAILED(1016, MsgConstant.VALIDATIONS_FAILED), DRAFT_SAVE_FAILED(1016, MsgConstant.DRAFT_SAVE_FAILED),
	INVALID_MONTHS(1016, MsgConstant.INVALID_MONTHS), RECORD_ALREADY_EXISTS(11500, MsgConstant.RECORD_ALREADY_EXISTS),
	PUBLICATION_DOC_HDR_ALREADY_EXISTS(11500, MsgConstant.BUDGET_PUBLICATION_DOC_HDR_ALREADY_EXISTS),
	ERA_RBD_RECORD_ALREADY_EXISTS(11500, MsgConstant.ERROR_ERA_RBD_ENTRY_ALREADY_EXISTS),
	ERA_PAY_REC_JOT_ALREADY_EXISTS(11500, MsgConstant.ERROR_ERA_PAY_REC_JOT_ALREADY_EXISTS),
	BUDGET_STM_ALREADY_MAPPED(11500, MsgConstant.BUDGET_STM_ALREADY_MAPPED),
	NOT_FOUND_MENU_CODE(1005, MsgConstant.NOT_FOUND_MENU_CODE),
	WF_ACTIONS_NOT_ALLOWED(2000, MsgConstant.WF_ACTIONS_NOT_ALLOWED),
	WF_MENU_NOT_ACCESS_MULTIPLE_ROLES(2010, MsgConstant.ERROR_TPP_WF_MENU_NOT_ACCESS_MULTIPLE_ROLES),
	INIT_WF_RL_IS_NOT_CONFIGURED(2001, MsgConstant.INIT_WF_RL_IS_NOT_CONFIGURED),
	WF_RL_IS_NOT_ASSIGNED(2002, MsgConstant.WF_RL_IS_NOT_ASSIGNED),
	EMP_ALREADY_APPROVED(11500, MsgConstant.EMP_ALREADY_APPROVED),
	CLASS_NOT_ALLOWED(1016, MsgConstant.CLASS_NOT_ALLOWED), CELL_NOT_ALLOWED(1016, MsgConstant.CELL_NOT_ALLOWED),
	LEVEL_NOT_ALLOWED(1026, MsgConstant.LEVEL_NOT_ALLOWED),
	TRN_ALREADY_APPROVED(11500, MsgConstant.TRN_ALREADY_APPROVED),
	TRN_GENERATION_FAILED(11500, MsgConstant.TRN_GENERATION_FAILED),
	REQUIRED_MENDATORY_ATTACHMENT(1005, MsgConstant.REQUIRED_MENDATORY_ATTACHMENT),
	EVENT_IN_PROGRESS(11500, MsgConstant.EVENT_IN_PROGRESS),
	EOL_ALREADY_APPROVED(11500, MsgConstant.EOL_ALREADY_APPROVED),
	TRN_WITHOUT_INCLUDE_FAILED(11500, MsgConstant.TRN_WITHOUT_INCLUDE_FAILED), FORGODELAY(1123, MsgConstant.FORGODELAY),
	PVU_PROMOTION_ALREADY_APPROVED(1123, MsgConstant.PVU_PROMOTION_ALREADY_APPROVED),
	ERROR_EMPLOYEE_JOINING_DATE(11500, MsgConstant.ERROR_EMPLOYEE_JOINING_DATE),
	PAY_BAND_NOT_ALLOWED(1017, MsgConstant.PAY_BAND_NOT_ALLOWED),
	GRADE_PAY_NOT_ALLOWED(1018, MsgConstant.GRADE_PAY_NOT_ALLOWED),
	LEVEL_LOWER_NOT_ALLOWED(1019, MsgConstant.LEVEL_LOWER_NOT_ALLOWED),
	PAY_SCALE_LOWER_NOT_ALLOWED(1020, MsgConstant.PAY_SCALE_LOWER_NOT_ALLOWED),
	PAY_BAND_LOWER_NOT_ALLOWED(1021, MsgConstant.PAY_BAND_LOWER_NOT_ALLOWED),
	GRADE_PAY_LOWER_NOT_ALLOWED(1022, MsgConstant.GRADE_PAY_LOWER_NOT_ALLOWED),
	REF_GENERATION_FAILED(11500, MsgConstant.REF_GENERATION_FAILED), WF_FAILED(2000, MsgConstant.WF_FAILED),
	MENU_ID_EMPTY(2100, MsgConstant.MENU_ID_EMPTY), TRN_ALREADY_REJECTED(11500, MsgConstant.TRN_ALREADY_REJECTED),
	TRANSACTION_OUT_OF_SYNCH(1023, MsgConstant.TRANSACTION_OUT_OF_SYNCH),
	IFMS_MSG_UPDATE(1024, MsgConstant.IFMS_MSG_UPDATE), INVALID_EDP_CODE(1099, MsgConstant.INVALID_EDP_CODE),
	ERROR_ERA_PHYSICAL_BILL_NOT_FOUND(2022, MsgConstant.ERA_PHYSICAL_BILL_NOT_FOUND),
	ERROR_ERA_ONLINE_BILL_NOT_FOUND(2023, MsgConstant.ERA_ONLINE_BILL_NOT_FOUND),
	ERROR_ERA_ERA_TOKEN_NO_NOT_FOUND(2023, MsgConstant.ERA_TOKEN_NO_NOT_FOUND),
	ERROR_ERA_ADVICE_EXIST(2023, MsgConstant.ERA_ADVICE_NO_EXIST),
	ERROR_ERA_CHEQUE_EXIST(2023, MsgConstant.ERA_CHEQUE_NO_EXIST),
	ERROR_ERA_EDP_CODE_NOT_VALID(404, MsgConstant.ERA_EDP_CODE_NOT_VALID),
	/*
	 * LEVEL_LOWER_NOT_ALLOWED_THEN_CURRENT(1023,MsgConstant.
	 * LEVEL_LOWER_NOT_ALLOWED_THEN_CURRENT),
	 * PAY_SCALE_LOWER_NOT_ALLOWED_THEN_CURRENT(1024,MsgConstant.
	 * PAY_SCALE_LOWER_NOT_ALLOWED_THEN_CURRENT),
	 * PAY_BAND_LOWER_NOT_ALLOWED_THEN_CURRENT(1025,MsgConstant.
	 * PAY_BAND_LOWER_NOT_ALLOWED_THEN_CURRENT),
	 * GRADE_PAY_LOWER_NOT_ALLOWED_THEN_CURRENT(1027,MsgConstant.
	 * GRADE_PAY_LOWER_NOT_ALLOWED_THEN_CURRENT);
	 */
	ERROR_WHILE_CALL_SP(10090, MsgConstant.ERROR_DURING_SP_CALL),
	ERROR_INVALID_OFFICE_TYPE(10091, MsgConstant.ERROR_DURING_SP_CALL),
	ERROR_MINISTER_IN_CHARGE_NOT_FOUND(10091, MsgConstant.ERROR_MINISTER_IN_CHARGE_NOT_FOUND),
	ERROR_INVALID_EMPLOYEE_NO(10092, MsgConstant.ERROR_INVALID_EMPLOYEE_NO),
	ERROR_INVALID_USER_NO(10092, MsgConstant.ERROR_INVALID_USER_NO),
	ERA_IFSC_CODE_DOES_NOT_MATCH(10092, MsgConstant.ERROR_ERA_IFSC_CODE_DOES_NOT_MATCH),
	ERA_INVALID_IFSC_CODE(10092, MsgConstant.ERROR_ERA_INVALID_IFSC_CODE),
	ERA_INVALID_MAJORHEAD_CODE(10092, MsgConstant.ERROR_ERA_INVALID_MAJORHEAD_CODE),
	ERA_MJRHD_CODE_DOES_NOT_MATCH(10092, MsgConstant.ERROR_ERA_MJRHD_CODE_DOES_NOT_MATCH),
	ERROR_USER_CAN_NOT_TRANSFER_OWN_POST(10093, MsgConstant.ERROR_USER_CAN_NOT_TRANSFER_OWN_POST),
	ERROR_EDP_EMP_OFFICE_NOT_MAPPED(10094, MsgConstant.ERROR_EDP_EMP_OFFICE_NOT_MAPPED),
	ERROR_REC_EST_CON_IS_ALREADY_PROCEESSED(3001, MsgConstant.BUDGET_ERROR_REC_EST_CON_IS_ALREADY_PROCEESSED),
	ERROR_NEW_ITEM_EST_ALREADY_CREATED(3002, MsgConstant.BUDGET_ERROR_NEW_ITEM_EST_ALREADY_CREATED),
	ERROR_SUPPL_DEMAND_BUDGET_HEAD_ALREADY_ADDED(3002, MsgConstant.BUDGET_SUPPL_DEMAND_BUDGET_HEAD_ALREADY_ADDED),
	ERROR_SUPPL_DEMAND_TRN_ALREADY_INITIATED(3002, MsgConstant.BUDGET_SUPPL_DEMAND_TRN_ALREADY_INITIATED),
	ERROR_NEW_ITEM_GIA_OBJ_BK_REQUIRED(3003, MsgConstant.ERROR_NEW_ITEM_GIA_OBJ_BK_REQUIRED),
	ERROR_REE_GIA_OBJ_BK_REQUIRED(3003, MsgConstant.ERROR_REE_GIA_OBJ_BK_REQUIRED),
	ERROR_NEW_ITEM_GIA_OBJ_URB_REQUIRED(3004, MsgConstant.ERROR_NEW_ITEM_GIA_OBJ_URB_REQUIRED),
	ERROR_REE_GIA_JTG_REQUIRED(3004, MsgConstant.ERROR_REE_GIA_JTG_REQUIRED),
	ERROR_NEW_ITEM_GIA_OBJ_TA_GA_REQUIRED(3005, MsgConstant.ERROR_NEW_ITEM_GIA_OBJ_TA_GA_REQUIRED),
	ERROR_REE_GIA_URB_REQUIRED(3005, MsgConstant.ERROR_REE_GIA_URB_REQUIRED),
	ERROR_NEW_ITEM_GIA_FORM_C_REQUIRED(3006, MsgConstant.ERROR_NEW_ITEM_GIA_FORM_C_REQUIRED),
	ERROR_BUDGET_TIMELIMITE_NOT_CREATED(3007, MsgConstant.ERROR_BUDGET_TIMELIMITE_NOT_CREATED),
	ERROR_BUDGET_TIMELIMITE_EXPIRED(3008, MsgConstant.ERROR_BUDGET_TIMELIMITE_EXPIRED),
	ERROR_BUDGET_PREVIOUS_WORK_NOT_EXISTS(3009, MsgConstant.ERROR_BUDGET_PREVIOUS_WORK_NOT_EXISTS),
	ERROR_EDP_EMP_NOT_FOUND(10095, MsgConstant.ERROR_EDP_EMP_NOT_FOUND),
	ERROR_COMMON_ATTACHMENT_CATEGORY(1009, MsgConstant.ERROR_COMMON_ATTACHMENT_CATEGORY),
	ERROR_WHILE_GET_FD_GROUP(1009, MsgConstant.ERROR_WHILE_GET_FD_GROUP),
	ERROR_EDP_BRANCH_BUDGET_ALREADY_EXISTS(10097, MsgConstant.EDP_BRANCH_BUDGET_ALREADY_EXISTS),
	ERROR_PAO_RANGE_TYPE_UNKNOWN(1000, MsgConstant.PAO_TOKEN_RANGE_TYPE_UNKNOWN),
	ERROR_PAO_RANGE_CNTR_ALLOCATED(1000, MsgConstant.PAO_TOKEN_RANGE_CNTR_ALLOC),
	ERROR_PAO_DUP_CNTR_NAME(1000, MsgConstant.PAO_DUP_CNTR_NAME),
	ERROR_PAO_RANGE_CNTR_COLLIDE(1000, MsgConstant.PAO_RANGE_CNTR_COLLIDE),
	ERROR_PAO_TOKEN_UNAVAILABLE(1000, MsgConstant.PAO_TOKEN_UNAVAILABLE),
	ERROR_PAO_LAST_TOKEN_NOT_IN_RANGE(1000, MsgConstant.PAO_LAST_TOKEN_NOT_IN_RANGE),
	ERROR_PVU_VALID_EMP(500, MsgConstant.PVU_VALID_EMP),
	ERROR_PAO_OBJ_DESC_DUP(1000, MsgConstant.ERROR_PAO_OBJ_DESC_DUP),
	ERROR_PAO_AUD_MAP_DUP(1000, MsgConstant.ERROR_PAO_AUD_MAP_DUP),
	ERROR_BILL_TYPE_UNKNOWN(1000, MsgConstant.ERROR_BILL_TYPE_UNKNOWN),
	ERROR_PAO_OBJ_UPDATE_NOT_ALLOWED(1000, MsgConstant.ERROR_PAO_OBJ_UPDATE_NOT_ALLOWED),
	ERROR_PAO_CARDEX_NO_NOT_EXIST(1000, MsgConstant.ERROR_PAO_CARDEX_NO_NOT_EXIST),
	ERROR_PAO_TOKEN_RANGE_CNTR_NOT_ALLOC(1000, MsgConstant.PAO_TOKEN_RANGE_CNTR_NOT_ALLOC),
	INVALID_BRANCH_CODE_ENTERD_BY_USER(2020, MsgConstant.INVALID_BRANCH_CODE_ENTERD_BY_USER),
	ERROR_PAO_RANGE_TOKEN_USED(1000, MsgConstant.ERROR_PAO_RANGE_TOKEN_USED),
	ERROR_PAO_OBJECTION_EXIST(1000, MsgConstant.ERROR_PAO_OBJECTION_EXIST),
	ERROR_PAO_VITO_CODE_INVALID(1000, MsgConstant.ERROR_PAO_VITO_CODE_INVALID),
	ERROR_PAO_EPAYMENTCODE_EXIST(1000, MsgConstant.ERROR_PAO_EPAYMENTCODE_EXIST),
	ERROR_ERA_AUDIT_MAP_ALRADY_CREATED(5001, MsgConstant.ERROR_ERA_AUDIT_MAP_ALRADY_CREATED),
	ERROR_CI_CHEQUE_BOOK_RECEIPT_VALIATION(10100, MsgConstant.ERROR_CI_CHEQUE_BOOK_VALIDATION),
	ERROR_CI_MINIMUM_STOCK_VALIATION(10101, MsgConstant.ERROR_CI_MINIMUM_STOCK_VALIATION),
	ERROR_CI_CTS_NOT_MAPPED(10098, MsgConstant.ERROR_CI_CTS_NOT_MAPPED),
	ERROR_CI_CTS_ALREADY_MAPPED(10099, MsgConstant.ERROR_CI_CTS_ALREADY_MAPPED),
	ERROR_TPP_START_DATE_MUST_NOT_BE_GREATERTHAN_TO_DATE(1000,
			MsgConstant.ERROR_TPP_START_DATE_MUST_NOT_BE_GREATERTHAN_TO_DATE),
	ERROR_TPP_START_DATE_MUST_BE_GREATERTHAN_ENTERED_DATE(1004,
			MsgConstant.ERROR_TPP_START_DATE_MUST_BE_GREATERTHAN_ENTERED_DATE),
	ERROR_TPP_START_DATE_MUST_NOT_BE_SAME_AS_ENTERED_DATE(1004,
			MsgConstant.ERROR_TPP_START_DATE_MUST_NOT_BE_SAME_AS_ENTERED_DATE),
	ERROR_TPP_AMT_MUST_NOT_BE_SAME(1004, MsgConstant.ERROR_TPP_AMT_MUST_NOT_BE_SAME),
	ERROR_TPP_PPO_NUMBER_DOES_NOT_EXIST(1004, MsgConstant.ERROR_TPP_PPO_NUMBER_DOES_NOT_EXIST),
	ERROR_TPP_PPO_NUMBER_IS_RECEIVED_IN_THE_TREASURY_OFFICE(1006,
			MsgConstant.ERROR_TPP_PPO_NUMBER_IS_RECEIVED_IN_THE_TREASURY_OFFICE),
	ERROR_TPP_PPO_NUMBER_IS_IN_PENDING_STATUS(1006, MsgConstant.ERROR_TPP_PPO_NUMBER_IS_IN_PENDING_STATUS),
	EDP_MSG_FETCH_LIST(1006, MsgConstant.EDP_MSG_FETCH_LIST),
	LIST_FETCH_FROM_SEARCH(1008, MsgConstant.LIST_FETCH_FROM_SEARCH), DATA_SAVED(1008, MsgConstant.DATA_SAVED),
	CLOSING_BALANCE_FETCH(1000, MsgConstant.CLOSING_BALANCE_FETCH),
	PREVIOUS_QUARTER_RECORD_NOT_APPROVED(1000, MsgConstant.PREVIOUS_QUARTER_RECORD_NOT_APPROVED),
	MULTIPLE_FY_YEARS_FOUND_ACTIVE(1000, MsgConstant.MULTIPLE_FY_YEAR_IS_ACTIVE),
	DUPLICATE_PAN_NO(1001, "Pan No already exist"),
	ERROR_PAO_CHEQUE_NUMBER_ASSIGNED(1001, MsgConstant.ERROR_PAO_CHEQUE_NUMBER_ASSIGNED),
	PAO_CHEQUE_DETAILS_NOT_FOUND(1001, MsgConstant.PAO_CHEQUE_DETAILS_NOT_FOUND),
	ERROR_PAO_EDIT_NOT_ALLOWED_REGISTER_RECORD(1000, MsgConstant.ERROR_PAO_EDIT_NOT_ALLOWED_REGISTER_RECORD),
	ERROR_PAO_CHEQUE_NUMBER_INVALID(1000, MsgConstant.ERROR_PAO_CHEQUE_NUMBER_INVALID),
	ERROR_PAO_DDO_NO_NOT_EXIST(1000, MsgConstant.ERROR_PAO_DDO_NO_NOT_EXIST),
	INVALID_CHEQUE_NO_ENTERD_BY_USER(2020, MsgConstant.INVALID_CHEQUE_NO_ENTERD_BY_USER),
	ERROR_TPP_MORE_THAN_ONE_ACTIVE_ENTRY_FOUND(1006, MsgConstant.ERROR_TPP_MORE_THAN_ONE_ACTIVE_ENTRY_FOUND),
	ERROR_PAO_ONE_TC_RANGE_PER_OFFICE_ID(1000, MsgConstant.ERROR_PAO_ONE_TC_RANGE_PER_OFFICE_ID),
	ERROR_PAO_TE_GRANT_DETAILS(1000, MsgConstant.ERROR_PAO_TE_GRANT_DETAILS),


	ERROR_PAO_POST_AUDIT(1000, MsgConstant.ERROR_PAO_POST_AUDIT),

	ERROR_PAO_LIASON_OFFICE(1000, MsgConstant.ERROR_PAO_LIASON_OFFICE),
	
	ERROR_PAO_TOKEN_NO_MANDATORY(1000, MsgConstant.TOKEN_NO_MANDATORY),
	
	ERROR_PAO_TE_GET(1000, MsgConstant.ERROR_PAO_TE_GET),
	
	ERROR_PAO_SEARCH_LIST(1000, MsgConstant.PAO_TE_SEARCHRESULT),
	//@changes done here
	ERROR_PAO__LO_SEARCH_LIST(1000, MsgConstant.PAO_LO_SEARCHRESULT),
	
	ERROR_PAO_ADVICE_NO_MANDATORY(1000, MsgConstant.ERROR_PAO_ADVICE_NO_MANDATORY),
	ERROR_PAO_VITO_REPORT_EXIST(1000, MsgConstant.ERROR_PAO_VITO_REPORT_EXIST),
	ERROR_AMOUNT_MUST_BE_LESS_THAN_ARREARS_AMOUNT(1006, MsgConstant.ERROR_AMOUNT_MUST_BE_LESS_THAN_ARREARS_AMOUNT),
	ERROR_WHILE_SAVING(3333, MsgConstant.ERROR_WHILE_SAVING),
	PAO_MULTIPLE_ADVICE_RANGE_ALLOC(2002, MsgConstant.PAO_MULTIPLE_ADVICE_RANGE_ALLOC),
	
	DOP_DATA_ENTRY_NOT_PROPER(1001, MsgConstant.DOP_DATA_ENTRY_NOT_PROPER),
	PAO_ADVICE_RANGE_NOT_ALLOC(2002, MsgConstant.PAO_ADVICE_RANGE_NOT_ALLOC),
	PAO_ADVICE_TIME_BARRED(2003, MsgConstant.PAO_ADVICE_TIME_BARRED);
	private final int code;
	private final String message;

	private ErrorResponse(int code, String description) {
		this.code = code;
		this.message = description;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage(String params) {
		return message + params;
	}

	@Override
	public String toString() {
		return code + ": " + message;
	}
}



