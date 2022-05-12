package gov.ifms.doi.db.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import gov.ifms.doi.jpa.constant.DoiJPAConstants;
import gov.ifms.doi.jpa.entity.BaseEntity;

/**
 * The persistent class for the TDOI_DB_PROP_MONEY_INTRANSIT database table.
 * 
 */
@Entity
@Table(name = "TDOI_DB_PROP_MONEY_INTRANSIT", schema = DoiJPAConstants.DOI_SCHEMA)
@NamedQuery(name = "TdoiDbPropMoneyIntransitEntity.findAll", query = "SELECT t FROM TdoiDbPropMoneyIntransitEntity t")
public class TdoiDbPropMoneyIntransitEntity extends BaseEntity {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROP_MONEY_INTRANS_ID", unique = true, nullable = false)
	private Long propMoneyIntransId;

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

	@Column(name = "FIRM_CAPITAL_PAID")
	private Double firmCapitalPaid;

	@Column(name = "INSRNC_PREMIUM")
	private Double insrncPremium;

	@Temporal(TemporalType.DATE)
	@Column(name = "INSUR_END_DT")
	private Date insurEndDt;

	@Column(name = "INSUR_EXPIRY_TIME", length = 10)
	private String insurExpiryTime;

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

	@Column(name = "PREM_DISC_AMT")
	private Double premDiscAmt;

	@Column(name = "PREM_DISC_PC")
	private Double premDiscPc;

	@Column(name = "PREM_GST_AMT")
	private Double premGstAmt;

	@Column(name = "PREM_GST_PC")
	private Double premGstPc;

	@Column(name = "PROPOSER_BUSINESS", length = 100)
	private String proposerBusiness;

	@Column(name = "PROPSL_POLICIES_ID", nullable = false)
	private Long propslPoliciesId;

	@Column(name = "RATE_OF_INTRST")
	private Double rateOfIntrst;

	@Column(name = "REFERENCE_DT")
	private Date referenceDt;

	@Column(name = "REFERENCE_NO", length = 30)
	private String referenceNo;

	@Column(name = "SUM_INSURED")
	private Double sumInsured;

	@Column(name = "TOT_ADDON_PREM")
	private Double totAddonPrem;

	@Column(name = "TOT_RI_AMT")
	private Double totRiAmt;

	@Column(name = "TOTAL_PREMIUM")
	private Double totalPremium;

	// bi-directional many-to-one association to TdoiDbPropMitInsurance
	@OneToMany(mappedBy = "tdoiDbPropMoneyIntransit",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<TdoiDbPropMitInsuranceEntity> tdoiDbPropMitInsurances;

	// bi-directional many-to-one association to TdoiDbPropMitRiDtl
	@OneToMany(mappedBy = "tdoiDbPropMoneyIntransit",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<TdoiDbPropMitRiDtlEntity> tdoiDbPropMitRiDtls;

	// bi-directional many-to-one association to TdoiDbPropMitWf
	@OneToMany(mappedBy = "tdoiDbPropMoneyIntransit",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<TdoiDbPropMitWfEntity> tdoiDbPropMitWfs;

	// bi-directional many-to-one association to TdoiDbProposal
	@ManyToOne
	@JoinColumn(name = "DB_PROPOSAL_ID", nullable = false)
	@JsonBackReference
	private TdoiDbProposalEntity tdoiDbProposal;

	public TdoiDbPropMoneyIntransitEntity() {
	}

	public Long getPropMoneyIntransId() {
		return this.propMoneyIntransId;
	}

	public void setPropMoneyIntransId(Long propMoneyIntransId) {
		this.propMoneyIntransId = propMoneyIntransId;
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

	public List<TdoiDbPropMitInsuranceEntity> getTdoiDbPropMitInsurances() {
		return this.tdoiDbPropMitInsurances;
	}

	public void setTdoiDbPropMitInsurances(List<TdoiDbPropMitInsuranceEntity> tdoiDbPropMitInsurances) {
		this.tdoiDbPropMitInsurances = tdoiDbPropMitInsurances;
	}

	public TdoiDbPropMitInsuranceEntity addTdoiDbPropMitInsurance(TdoiDbPropMitInsuranceEntity tdoiDbPropMitInsurance) {
		getTdoiDbPropMitInsurances().add(tdoiDbPropMitInsurance);
		tdoiDbPropMitInsurance.setTdoiDbPropMoneyIntransit(this);

		return tdoiDbPropMitInsurance;
	}

	public TdoiDbPropMitInsuranceEntity removeTdoiDbPropMitInsurance(
			TdoiDbPropMitInsuranceEntity tdoiDbPropMitInsurance) {
		getTdoiDbPropMitInsurances().remove(tdoiDbPropMitInsurance);
		tdoiDbPropMitInsurance.setTdoiDbPropMoneyIntransit(null);

		return tdoiDbPropMitInsurance;
	}

	public List<TdoiDbPropMitRiDtlEntity> getTdoiDbPropMitRiDtls() {
		return this.tdoiDbPropMitRiDtls;
	}

	public void setTdoiDbPropMitRiDtls(List<TdoiDbPropMitRiDtlEntity> tdoiDbPropMitRiDtls) {
		this.tdoiDbPropMitRiDtls = tdoiDbPropMitRiDtls;
	}

	public TdoiDbPropMitRiDtlEntity addTdoiDbPropMitRiDtl(TdoiDbPropMitRiDtlEntity tdoiDbPropMitRiDtl) {
		getTdoiDbPropMitRiDtls().add(tdoiDbPropMitRiDtl);
		tdoiDbPropMitRiDtl.setTdoiDbPropMoneyIntransit(this);

		return tdoiDbPropMitRiDtl;
	}

	public TdoiDbPropMitRiDtlEntity removeTdoiDbPropMitRiDtl(TdoiDbPropMitRiDtlEntity tdoiDbPropMitRiDtl) {
		getTdoiDbPropMitRiDtls().remove(tdoiDbPropMitRiDtl);
		tdoiDbPropMitRiDtl.setTdoiDbPropMoneyIntransit(null);

		return tdoiDbPropMitRiDtl;
	}

	public List<TdoiDbPropMitWfEntity> getTdoiDbPropMitWfs() {
		return this.tdoiDbPropMitWfs;
	}

	public void setTdoiDbPropMitWfs(List<TdoiDbPropMitWfEntity> tdoiDbPropMitWfs) {
		this.tdoiDbPropMitWfs = tdoiDbPropMitWfs;
	}

	public TdoiDbPropMitWfEntity addTdoiDbPropMitWf(TdoiDbPropMitWfEntity tdoiDbPropMitWf) {
		getTdoiDbPropMitWfs().add(tdoiDbPropMitWf);
		tdoiDbPropMitWf.setTdoiDbPropMoneyIntransit(this);

		return tdoiDbPropMitWf;
	}

	public TdoiDbPropMitWfEntity removeTdoiDbPropMitWf(TdoiDbPropMitWfEntity tdoiDbPropMitWf) {
		getTdoiDbPropMitWfs().remove(tdoiDbPropMitWf);
		tdoiDbPropMitWf.setTdoiDbPropMoneyIntransit(null);

		return tdoiDbPropMitWf;
	}

	public TdoiDbProposalEntity getTdoiDbProposal() {
		return this.tdoiDbProposal;
	}

	public void setTdoiDbProposal(TdoiDbProposalEntity tdoiDbProposal) {
		this.tdoiDbProposal = tdoiDbProposal;
	}

}