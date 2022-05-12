package gov.ifms.doi.db.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import gov.ifms.doi.jpa.constant.DoiJPAConstants;
import gov.ifms.doi.jpa.dto.BaseDto;

/**
 * The persistent class for the TDOI_DB_POL_MONEY_INTRANSIT database table.
 * 
 */

public class TdoiDbPolMoneyIntransitDTO extends BaseDto {
	private static final Long serialVersionUID = 1L;

	private Long polMoneyIntransId;

	private Long bankId;

	private String bankName;

	private Long branchId;

	private String branchName;

	private Double challanAmount;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date challanDt;

	private String challanNo;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date chequeDdDt;

	private String chequeDdNo;

	private Double firmCapitalPaid;

	private Double insrncPremium;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date insurEndDt;

	private String insurExpiryTime;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date insurStartDt;

	private String isRiReqd;

	private Double payablePremAmt;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date paymentDate;

	private Long paymentModeId;

	private Double premDiscAmt;

	private Double premDiscPc;

	private Double premGstAmt;

	private Double premGstPc;

	private String proposerBusiness;

	private Long propslPoliciesId;

	private Double rateOfIntrst;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date referenceDt;

	private String referenceNo;

	private Double sumInsured;

	private Double totAddonPrem;

	private Double totRiAmt;

	private Double totalPremium;

	// bi-directional many-to-one association to TdoiDbPolMitInsurance
	private List<TdoiDbPolMitInsuranceDTO> tdoiDbPolMitInsurances;

	// bi-directional many-to-one association to TdoiDbPolMitRiDtl
	private List<TdoiDbPolMitRiDtlDTO> tdoiDbPolMitRiDtls;

	// bi-directional many-to-one association to TdoiDbPolMitWf
	private List<TdoiDbPolMitWfDTO> tdoiDbPolMitWfs;

	// bi-directional many-to-one association to TdoiDbProposal

	private TdoiDbProposalDTO tdoiDbProposal;

	public TdoiDbPolMoneyIntransitDTO() {
	}

	public Long getPolMoneyIntransId() {
		return this.polMoneyIntransId;
	}

	public void setPolMoneyIntransId(Long polMoneyIntransId) {
		this.polMoneyIntransId = polMoneyIntransId;
	}

	public Long getBankId() {
		return this.bankId;
	}

	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Long getBranchId() {
		return this.branchId;
	}

	public void setBranchId(Long branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getChallanAmount() {
		return this.challanAmount;
	}

	public void setChallanAmount(Double challanAmount) {
		this.challanAmount = challanAmount;
	}

	public Date getChallanDt() {
		return this.challanDt;
	}

	public void setChallanDt(Date challanDt) {
		this.challanDt = challanDt;
	}

	public String getChallanNo() {
		return this.challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public Date getChequeDdDt() {
		return this.chequeDdDt;
	}

	public void setChequeDdDt(Date chequeDdDt) {
		this.chequeDdDt = chequeDdDt;
	}

	public String getChequeDdNo() {
		return this.chequeDdNo;
	}

	public void setChequeDdNo(String chequeDdNo) {
		this.chequeDdNo = chequeDdNo;
	}

	public Double getFirmCapitalPaid() {
		return this.firmCapitalPaid;
	}

	public void setFirmCapitalPaid(Double firmCapitalPaid) {
		this.firmCapitalPaid = firmCapitalPaid;
	}

	public Double getInsrncPremium() {
		return this.insrncPremium;
	}

	public void setInsrncPremium(Double insrncPremium) {
		this.insrncPremium = insrncPremium;
	}

	public Date getInsurEndDt() {
		return this.insurEndDt;
	}

	public void setInsurEndDt(Date insurEndDt) {
		this.insurEndDt = insurEndDt;
	}

	public String getInsurExpiryTime() {
		return this.insurExpiryTime;
	}

	public void setInsurExpiryTime(String insurExpiryTime) {
		this.insurExpiryTime = insurExpiryTime;
	}

	public Date getInsurStartDt() {
		return this.insurStartDt;
	}

	public void setInsurStartDt(Date insurStartDt) {
		this.insurStartDt = insurStartDt;
	}

	public String getIsRiReqd() {
		return this.isRiReqd;
	}

	public void setIsRiReqd(String isRiReqd) {
		this.isRiReqd = isRiReqd;
	}

	public Double getPayablePremAmt() {
		return this.payablePremAmt;
	}

	public void setPayablePremAmt(Double payablePremAmt) {
		this.payablePremAmt = payablePremAmt;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Long getPaymentModeId() {
		return this.paymentModeId;
	}

	public void setPaymentModeId(Long paymentModeId) {
		this.paymentModeId = paymentModeId;
	}

	public Double getPremDiscAmt() {
		return this.premDiscAmt;
	}

	public void setPremDiscAmt(Double premDiscAmt) {
		this.premDiscAmt = premDiscAmt;
	}

	public Double getPremDiscPc() {
		return this.premDiscPc;
	}

	public void setPremDiscPc(Double premDiscPc) {
		this.premDiscPc = premDiscPc;
	}

	public Double getPremGstAmt() {
		return this.premGstAmt;
	}

	public void setPremGstAmt(Double premGstAmt) {
		this.premGstAmt = premGstAmt;
	}

	public Double getPremGstPc() {
		return this.premGstPc;
	}

	public void setPremGstPc(Double premGstPc) {
		this.premGstPc = premGstPc;
	}

	public String getProposerBusiness() {
		return this.proposerBusiness;
	}

	public void setProposerBusiness(String proposerBusiness) {
		this.proposerBusiness = proposerBusiness;
	}

	public Long getPropslPoliciesId() {
		return this.propslPoliciesId;
	}

	public void setPropslPoliciesId(Long propslPoliciesId) {
		this.propslPoliciesId = propslPoliciesId;
	}

	public Double getRateOfIntrst() {
		return this.rateOfIntrst;
	}

	public void setRateOfIntrst(Double rateOfIntrst) {
		this.rateOfIntrst = rateOfIntrst;
	}

	public Date getReferenceDt() {
		return this.referenceDt;
	}

	public void setReferenceDt(Date referenceDt) {
		this.referenceDt = referenceDt;
	}

	public String getReferenceNo() {
		return this.referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public Double getSumInsured() {
		return this.sumInsured;
	}

	public void setSumInsured(Double sumInsured) {
		this.sumInsured = sumInsured;
	}

	public Double getTotAddonPrem() {
		return this.totAddonPrem;
	}

	public void setTotAddonPrem(Double totAddonPrem) {
		this.totAddonPrem = totAddonPrem;
	}

	public Double getTotRiAmt() {
		return this.totRiAmt;
	}

	public void setTotRiAmt(Double totRiAmt) {
		this.totRiAmt = totRiAmt;
	}

	public Double getTotalPremium() {
		return this.totalPremium;
	}

	public void setTotalPremium(Double totalPremium) {
		this.totalPremium = totalPremium;
	}

	public List<TdoiDbPolMitInsuranceDTO> getTdoiDbPolMitInsurances() {
		return this.tdoiDbPolMitInsurances;
	}

	public void setTdoiDbPolMitInsurances(List<TdoiDbPolMitInsuranceDTO> tdoiDbPolMitInsurances) {
		this.tdoiDbPolMitInsurances = tdoiDbPolMitInsurances;
	}

	public TdoiDbPolMitInsuranceDTO addTdoiDbPolMitInsurance(TdoiDbPolMitInsuranceDTO tdoiDbPolMitInsurance) {
		getTdoiDbPolMitInsurances().add(tdoiDbPolMitInsurance);
		tdoiDbPolMitInsurance.setTdoiDbPolMoneyIntransit(this);

		return tdoiDbPolMitInsurance;
	}

	public TdoiDbPolMitInsuranceDTO removeTdoiDbPolMitInsurance(TdoiDbPolMitInsuranceDTO tdoiDbPolMitInsurance) {
		getTdoiDbPolMitInsurances().remove(tdoiDbPolMitInsurance);
		tdoiDbPolMitInsurance.setTdoiDbPolMoneyIntransit(null);

		return tdoiDbPolMitInsurance;
	}

	public List<TdoiDbPolMitRiDtlDTO> getTdoiDbPolMitRiDtls() {
		return this.tdoiDbPolMitRiDtls;
	}

	public void setTdoiDbPolMitRiDtls(List<TdoiDbPolMitRiDtlDTO> tdoiDbPolMitRiDtls) {
		this.tdoiDbPolMitRiDtls = tdoiDbPolMitRiDtls;
	}

	public TdoiDbPolMitRiDtlDTO addTdoiDbPolMitRiDtl(TdoiDbPolMitRiDtlDTO tdoiDbPolMitRiDtl) {
		getTdoiDbPolMitRiDtls().add(tdoiDbPolMitRiDtl);
		tdoiDbPolMitRiDtl.setTdoiDbPolMoneyIntransit(this);

		return tdoiDbPolMitRiDtl;
	}

	public TdoiDbPolMitRiDtlDTO removeTdoiDbPolMitRiDtl(TdoiDbPolMitRiDtlDTO tdoiDbPolMitRiDtl) {
		getTdoiDbPolMitRiDtls().remove(tdoiDbPolMitRiDtl);
		tdoiDbPolMitRiDtl.setTdoiDbPolMoneyIntransit(null);

		return tdoiDbPolMitRiDtl;
	}

	public List<TdoiDbPolMitWfDTO> getTdoiDbPolMitWfs() {
		return this.tdoiDbPolMitWfs;
	}

	public void setTdoiDbPolMitWfs(List<TdoiDbPolMitWfDTO> tdoiDbPolMitWfs) {
		this.tdoiDbPolMitWfs = tdoiDbPolMitWfs;
	}

	public TdoiDbPolMitWfDTO addTdoiDbPolMitWf(TdoiDbPolMitWfDTO tdoiDbPolMitWf) {
		getTdoiDbPolMitWfs().add(tdoiDbPolMitWf);
		tdoiDbPolMitWf.setTdoiDbPolMoneyIntransit(this);

		return tdoiDbPolMitWf;
	}

	public TdoiDbPolMitWfDTO removeTdoiDbPolMitWf(TdoiDbPolMitWfDTO tdoiDbPolMitWf) {
		getTdoiDbPolMitWfs().remove(tdoiDbPolMitWf);
		tdoiDbPolMitWf.setTdoiDbPolMoneyIntransit(null);

		return tdoiDbPolMitWf;
	}

	public TdoiDbProposalDTO getTdoiDbProposal() {
		return this.tdoiDbProposal;
	}

	public void setTdoiDbProposal(TdoiDbProposalDTO tdoiDbProposal) {
		this.tdoiDbProposal = tdoiDbProposal;
	}

}
