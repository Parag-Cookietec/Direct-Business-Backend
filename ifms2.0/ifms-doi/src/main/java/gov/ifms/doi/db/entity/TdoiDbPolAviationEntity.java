package gov.ifms.doi.db.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import gov.ifms.doi.jpa.constant.DoiJPAConstants;
import gov.ifms.doi.jpa.entity.BaseEntity;

/**
 * The persistent class for the TDOI_DB_POL_AVIATION database table.
 * 
 */
@Entity
@Table(name = "TDOI_DB_POL_AVIATION", schema = DoiJPAConstants.DOI_SCHEMA)
@NamedQuery(name = "TdoiDbPolAviationEntity.findAll", query = "SELECT t FROM TdoiDbPolAviationEntity t")
public class TdoiDbPolAviationEntity extends BaseEntity {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "POL_AVIATION_ID", unique = true, nullable = false)
	private Long polAviationId;

	@Column(name = "AIRCRAFT_GEOG_LMT", length = 100)
	private String aircraftGeogLmt;

	@Column(name = "AIRCRAFT_STD_INSTR", length = 100)
	private String aircraftStdInstr;

	@Column(name = "AIRCRAFT_USED_PURP", length = 100)
	private String aircraftUsedPurp;

	@Column(name = "APPL_DEDUCTION")
	private Double applDeduction;

	@Column(name = "BANK_ID")
	private Long bankId;

	@Column(name = "BANK_NAME", length = 40)
	private String bankName;

	@Column(name = "BRANCH_ID")
	private Long branchId;

	@Column(name = "BRANCH_NAME", length = 40)
	private String branchName;

	@Column(name = "CHALLAN_AMOUNT")
	private Double challanAmount;

	@Temporal(TemporalType.DATE)
	@Column(name = "CHALLAN_DT")
	private Date challanDt;

	@Column(name = "CHALLAN_NO", length = 20)
	private String challanNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "CHEQUE_DD_DT")
	private Date chequeDdDt;

	@Column(name = "CHEQUE_DD_NO", length = 20)
	private String chequeDdNo;

	@Column(name = "CREW_PA_COVER")
	private Double crewPaCover;

	@Column(name = "INSRNC_PREMIUM")
	private Double insrncPremium;

	@Temporal(TemporalType.DATE)
	@Column(name = "INSUR_END_DT")
	private Date insurEndDt;

	@Temporal(TemporalType.DATE)
	@Column(name = "INSUR_START_DT")
	private Date insurStartDt;

	@Column(name = "IS_RI_REQD", length = 1)
	private String isRiReqd;

	@Column(name = "PAYABLE_PREM_AMT")
	private Double payablePremAmt;

	@Temporal(TemporalType.DATE)
	@Column(name = "PAYMENT_DATE")
	private Date paymentDate;

	@Column(name = "PAYMENT_MODE_ID")
	private Long paymentModeId;

	@Column(name = "PILOT_WARRANTY", length = 100)
	private String pilotWarranty;

	@Column(name = "PLL_AMT")
	private Double pllAmt;

	@Temporal(TemporalType.DATE)
	@Column(name = "POLICT_DT")
	private Date polictDt;

	@Column(name = "POLICY_NO", length = 30)
	private String policyNo;

	@Column(name = "POLICY_TYPE_ID")
	private Long policyTypeId;

	@Column(name = "PREM_DISC_AMT")
	private Double premDiscAmt;

	@Column(name = "PREM_DISC_PC")
	private Double premDiscPc;

	@Column(name = "PREM_GST_AMT")
	private Double premGstAmt;

	@Column(name = "PREM_GST_PC")
	private Double premGstPc;

	@Column(name = "PREV_POLICY_NO", length = 40)
	private String prevPolicyNo;

	@Column(name = "PROPSL_POLICIES_ID", nullable = false)
	private Long propslPoliciesId;

	@Column(name = "RATE_OF_INTRST")
	private Double rateOfIntrst;

	@Column(name = "REFERENCE_DT")
	private Date referenceDt;

	@Column(name = "REFERENCE_NO", length = 30)
	private String referenceNo;

	@Column(name = "RISK_COVERED_DTLS", length = 200)
	private String riskCoveredDtls;

	@Column(name = "SUM_INSURED")
	private Double sumInsured;

	@Column(name = "TOT_ADDON_PREM")
	private Double totAddonPrem;

	@Column(name = "TOT_AGREED_VAL")
	private Double totAgreedVal;

	@Column(name = "TOT_RI_AMT")
	private Double totRiAmt;

	@Column(name = "TOTAL_PREMIUM")
	private Double totalPremium;

	@Column(name = "TPL_CSL_LIAB")
	private Double tplCslLiab;

	// bi-directional many-to-one association to TdoiDbProposal
	@ManyToOne
	@JoinColumn(name = "DB_PROPOSAL_ID", nullable = false)
	@JsonBackReference
	private TdoiDbProposalEntity tdoiDbProposal;

	// bi-directional many-to-one association to TdoiDbPolAviationAircraft
	@OneToMany(mappedBy = "tdoiDbPolAviation",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<TdoiDbPolAviationAircraftEntity> tdoiDbPolAviationAircrafts;

	// bi-directional many-to-one association to TdoiDbPolAviationRiDtl
	@OneToMany(mappedBy = "tdoiDbPolAviation",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<TdoiDbPolAviationRiDtlEntity> tdoiDbPolAviationRiDtls;

	// bi-directional many-to-one association to TdoiDbPolAviationWf
	@OneToMany(mappedBy = "tdoiDbPolAviation",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<TdoiDbPolAviationWfEntity> tdoiDbPolAviationWfs;

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

	public TdoiDbProposalEntity getTdoiDbProposal() {
		return this.tdoiDbProposal;
	}

	public void setTdoiDbProposal(TdoiDbProposalEntity tdoiDbProposal) {
		this.tdoiDbProposal = tdoiDbProposal;
	}

	public List<TdoiDbPolAviationAircraftEntity> getTdoiDbPolAviationAircrafts() {
		return this.tdoiDbPolAviationAircrafts;
	}

	public void setTdoiDbPolAviationAircrafts(List<TdoiDbPolAviationAircraftEntity> tdoiDbPolAviationAircrafts) {
		this.tdoiDbPolAviationAircrafts = tdoiDbPolAviationAircrafts;
	}

	public List<TdoiDbPolAviationRiDtlEntity> getTdoiDbPolAviationRiDtls() {
		return this.tdoiDbPolAviationRiDtls;
	}

	public void setTdoiDbPolAviationRiDtls(List<TdoiDbPolAviationRiDtlEntity> tdoiDbPolAviationRiDtls) {
		this.tdoiDbPolAviationRiDtls = tdoiDbPolAviationRiDtls;
	}

	public List<TdoiDbPolAviationWfEntity> getTdoiDbPolAviationWfs() {
		return this.tdoiDbPolAviationWfs;
	}

	public void setTdoiDbPolAviationWfs(List<TdoiDbPolAviationWfEntity> tdoiDbPolAviationWfs) {
		this.tdoiDbPolAviationWfs = tdoiDbPolAviationWfs;
	}


	public void addTdoiDbPolAviationAircraft(TdoiDbPolAviationAircraftEntity polAviationAircraft) {
		getTdoiDbPolAviationAircrafts().add(polAviationAircraft);
		polAviationAircraft.setTdoiDbPolAviation(this);
	}

	public void addTdoiDbPolAviationRiDtl(TdoiDbPolAviationRiDtlEntity tdoiDbPropAviationRiDtl) {
		getTdoiDbPolAviationRiDtls().add(tdoiDbPropAviationRiDtl);
		tdoiDbPropAviationRiDtl.setTdoiDbPolAviation(this);
	}
}