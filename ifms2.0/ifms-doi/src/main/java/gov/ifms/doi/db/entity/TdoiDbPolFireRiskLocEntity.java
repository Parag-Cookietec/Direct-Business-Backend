package gov.ifms.doi.db.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import gov.ifms.doi.jpa.constant.DoiJPAConstants;
import gov.ifms.doi.jpa.entity.BaseEntity;

import javax.persistence.*;

/**
 * The persistent class for the TDOI_DB_FIRE_RISK_LOC database table.
 * 
 */
@Entity
@Table(name = "TDOI_DB_POL_FIRE_RISK_LOC", schema = DoiJPAConstants.DOI_SCHEMA)
@NamedQuery(name = "TdoiDbPolFireRiskLocEntity.findAll", query = "SELECT t FROM TdoiDbPolFireRiskLocEntity t")
public class TdoiDbPolFireRiskLocEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FIRE_RISK_LOC_ID", unique = true, nullable = false)
	private long fireRiskLocId;

	@Column(name = "LOCATION_ADDRESS", length = 200)
	private String locationAddress;

	private long pincode;

	@Column(name = "RISK_LOCATION", length = 100)
	private String riskLocation;

	// bi-directional many-to-one association to TdoiDbProposal
	@ManyToOne
	@JoinColumn(name = "DB_PROPOSAL_ID", nullable = false)
	@JsonBackReference
	private TdoiDbProposalEntity tdoiDbProposal;

	// bi-directional many-to-one association to tdoiDbPolFirePeril
	@ManyToOne
	@JoinColumn(name = "POL_FIRE_PERIL_ID", nullable = false)
	@JsonBackReference
	private TdoiDbPolFirePerilEntity tdoiDbPolFirePeril;

	public TdoiDbPolFireRiskLocEntity() {
	}

	public long getFireRiskLocId() {
		return this.fireRiskLocId;
	}

	public void setFireRiskLocId(long fireRiskLocId) {
		this.fireRiskLocId = fireRiskLocId;
	}

	public String getLocationAddress() {
		return this.locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public long getPincode() {
		return this.pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getRiskLocation() {
		return this.riskLocation;
	}

	public void setRiskLocation(String riskLocation) {
		this.riskLocation = riskLocation;
	}

	public TdoiDbProposalEntity getTdoiDbProposal() {
		return this.tdoiDbProposal;
	}

	public void setTdoiDbProposal(TdoiDbProposalEntity tdoiDbProposal) {
		this.tdoiDbProposal = tdoiDbProposal;
	}

	public TdoiDbPolFirePerilEntity getTdoiDbPolFirePeril() {
		return tdoiDbPolFirePeril;
	}

	public void setTdoiDbPolFirePeril(TdoiDbPolFirePerilEntity tdoiDbPolFirePeril) {
		this.tdoiDbPolFirePeril = tdoiDbPolFirePeril;
	}
}