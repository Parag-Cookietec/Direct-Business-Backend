package gov.ifms.doi.db.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import gov.ifms.doi.jpa.constant.DoiJPAConstants;
import gov.ifms.doi.jpa.dto.BaseDto;

/**
 * The persistent class for the TDOI_DB_POL_AVIATION database table.
 * 
 */

public class TdoiDbPolAviationDTO extends BaseDto {
	private static final Long serialVersionUID = 1L;

	private Long polAviationId;

	private String aircraftGeogLmt;

	private String aircraftStdInstr;

	private String aircraftUsedPurp;

	private Double applDeduction;

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

	private Double crewPaCover;

	private Double insrncPremium;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date insurEndDt;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date insurStartDt;

	private String isRiReqd;

	private Double payablePremAmt;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date paymentDate;

	private Long paymentModeId;

	private String pilotWarranty;

	private Double pllAmt;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date polictDt;

	private String policyNo;

	private Long policyTypeId;

	private Double premDiscAmt;

	private Double premDiscPc;

	private Double premGstAmt;

	private Double premGstPc;

	private String prevPolicyNo;

	private Long propslPoliciesId;

	private Double rateOfIntrst;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DoiJPAConstants.DOI_DATE_FORMAT)
	private Date referenceDt;

	private String referenceNo;

	private String riskCoveredDtls;

	private Double sumInsured;

	private Double totAddonPrem;

	private Double totAgreedVal;

	private Double totRiAmt;

	private Double totalPremium;

	private Double tplCslLiab;

	// bi-directional many-to-one association to TdoiDbProposal

	private TdoiDbProposalDTO tdoiDbProposal;

	// bi-directional many-to-one association to TdoiDbPolAviationAircraft
	private List<TdoiDbPolAviationAircraftDTO> tdoiDbPolAviationAircrafts;

	// bi-directional many-to-one association to TdoiDbPolAviationRiDtl
	private List<TdoiDbPolAviationRiDtlDTO> tdoiDbPolAviationRiDtls;

	// bi-directional many-to-one association to TdoiDbPolAviationWf
	private List<TdoiDbPolAviationWfDTO> tdoiDbPolAviationWfs;

	public Long getPolAviationId() {
		return this.polAviationId;
	}

	public void setPolAviationId(Long polAviationId) {
		this.polAviationId = polAviationId;
	}

	public String getAircraftGeogLmt() {
		return this.aircraftGeogLmt;
	}

	public void setAircraftGeogLmt(String aircraftGeogLmt) {
		this.aircraftGeogLmt = aircraftGeogLmt;
	}

	public String getAircraftStdInstr() {
		return this.aircraftStdInstr;
	}

	public void setAircraftStdInstr(String aircraftStdInstr) {
		this.aircraftStdInstr = aircraftStdInstr;
	}

	public String getAircraftUsedPurp() {
		return this.aircraftUsedPurp;
	}

	public void setAircraftUsedPurp(String aircraftUsedPurp) {
		this.aircraftUsedPurp = aircraftUsedPurp;
	}

	public Double getApplDeduction() {
		return this.applDeduction;
	}

	public void setApplDeduction(Double applDeduction) {
		this.applDeduction = applDeduction;
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

	public Double getCrewPaCover() {
		return this.crewPaCover;
	}

	public void setCrewPaCover(Double crewPaCover) {
		this.crewPaCover = crewPaCover;
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

	public String getPilotWarranty() {
		return this.pilotWarranty;
	}

	public void setPilotWarranty(String pilotWarranty) {
		this.pilotWarranty = pilotWarranty;
	}

	public Double getPllAmt() {
		return this.pllAmt;
	}

	public void setPllAmt(Double pllAmt) {
		this.pllAmt = pllAmt;
	}

	public Date getPolictDt() {
		return this.polictDt;
	}

	public void setPolictDt(Date polictDt) {
		this.polictDt = polictDt;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public Long getPolicyTypeId() {
		return this.policyTypeId;
	}

	public void setPolicyTypeId(Long policyTypeId) {
		this.policyTypeId = policyTypeId;
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

	public String getPrevPolicyNo() {
		return this.prevPolicyNo;
	}

	public void setPrevPolicyNo(String prevPolicyNo) {
		this.prevPolicyNo = prevPolicyNo;
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

	public String getRiskCoveredDtls() {
		return this.riskCoveredDtls;
	}

	public void setRiskCoveredDtls(String riskCoveredDtls) {
		this.riskCoveredDtls = riskCoveredDtls;
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

	public Double getTotAgreedVal() {
		return this.totAgreedVal;
	}

	public void setTotAgreedVal(Double totAgreedVal) {
		this.totAgreedVal = totAgreedVal;
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

	public Double getTplCslLiab() {
		return this.tplCslLiab;
	}

	public void setTplCslLiab(Double tplCslLiab) {
		this.tplCslLiab = tplCslLiab;
	}

	public TdoiDbProposalDTO getTdoiDbProposal() {
		return this.tdoiDbProposal;
	}

	public void setTdoiDbProposal(TdoiDbProposalDTO tdoiDbProposal) {
		this.tdoiDbProposal = tdoiDbProposal;
	}

	public List<TdoiDbPolAviationAircraftDTO> getTdoiDbPolAviationAircrafts() {
		return this.tdoiDbPolAviationAircrafts;
	}

	public void setTdoiDbPolAviationAircrafts(List<TdoiDbPolAviationAircraftDTO> tdoiDbPolAviationAircrafts) {
		this.tdoiDbPolAviationAircrafts = tdoiDbPolAviationAircrafts;
	}

	public TdoiDbPolAviationAircraftDTO addTdoiDbPolAviationAircraft(
			TdoiDbPolAviationAircraftDTO tdoiDbPolAviationAircraft) {
		getTdoiDbPolAviationAircrafts().add(tdoiDbPolAviationAircraft);

		return tdoiDbPolAviationAircraft;
	}

	public TdoiDbPolAviationAircraftDTO removeTdoiDbPolAviationAircraft(
			TdoiDbPolAviationAircraftDTO tdoiDbPolAviationAircraft) {
		getTdoiDbPolAviationAircrafts().remove(tdoiDbPolAviationAircraft);

		return tdoiDbPolAviationAircraft;
	}

	public List<TdoiDbPolAviationRiDtlDTO> getTdoiDbPolAviationRiDtls() {
		return this.tdoiDbPolAviationRiDtls;
	}

	public void setTdoiDbPolAviationRiDtls(List<TdoiDbPolAviationRiDtlDTO> tdoiDbPolAviationRiDtls) {
		this.tdoiDbPolAviationRiDtls = tdoiDbPolAviationRiDtls;
	}

	public TdoiDbPolAviationRiDtlDTO addTdoiDbPolAviationRiDtl(TdoiDbPolAviationRiDtlDTO tdoiDbPolAviationRiDtl) {
		getTdoiDbPolAviationRiDtls().add(tdoiDbPolAviationRiDtl);

		return tdoiDbPolAviationRiDtl;
	}

	public TdoiDbPolAviationRiDtlDTO removeTdoiDbPolAviationRiDtl(TdoiDbPolAviationRiDtlDTO tdoiDbPolAviationRiDtl) {
		getTdoiDbPolAviationRiDtls().remove(tdoiDbPolAviationRiDtl);
		return tdoiDbPolAviationRiDtl;
	}

	public List<TdoiDbPolAviationWfDTO> getTdoiDbPolAviationWfs() {
		return this.tdoiDbPolAviationWfs;
	}

	public void setTdoiDbPolAviationWfs(List<TdoiDbPolAviationWfDTO> tdoiDbPolAviationWfs) {
		this.tdoiDbPolAviationWfs = tdoiDbPolAviationWfs;
	}

	public TdoiDbPolAviationWfDTO addTdoiDbPolAviationWf(TdoiDbPolAviationWfDTO tdoiDbPolAviationWf) {
		getTdoiDbPolAviationWfs().add(tdoiDbPolAviationWf);

		return tdoiDbPolAviationWf;
	}

	public TdoiDbPolAviationWfDTO removeTdoiDbPolAviationWf(TdoiDbPolAviationWfDTO tdoiDbPolAviationWf) {
		getTdoiDbPolAviationWfs().remove(tdoiDbPolAviationWf);
		return tdoiDbPolAviationWf;
	}

}
