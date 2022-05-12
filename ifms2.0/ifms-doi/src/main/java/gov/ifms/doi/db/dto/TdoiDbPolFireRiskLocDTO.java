package gov.ifms.doi.db.dto;

import gov.ifms.doi.jpa.dto.BaseDto;

/**
 * The persistent class for the TDOI_DB_FIRE_RISK_LOC database table.
 * 
 */

public class TdoiDbPolFireRiskLocDTO extends BaseDto {
	private static final long serialVersionUID = 1L;

	private long fireRiskLocId;

	private String locationAddress;

	private long pincode;

	private String riskLocation;

	// bi-directional many-to-one association to TdoiDbProposal
	private TdoiDbProposalDTO tdoiDbProposal;

	// bi-directional many-to-one association to tdoiDbPolFirePeril
	private TdoiDbPolFirePerilDTO tdoiDbPolFirePeril;

	public TdoiDbPolFireRiskLocDTO() {
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

	public TdoiDbProposalDTO getTdoiDbProposal() {
		return this.tdoiDbProposal;
	}

	public void setTdoiDbProposal(TdoiDbProposalDTO tdoiDbProposal) {
		this.tdoiDbProposal = tdoiDbProposal;
	}

	public TdoiDbPolFirePerilDTO getTdoiDbPolFirePeril() {
		return tdoiDbPolFirePeril;
	}

	public void setTdoiDbPolFirePeril(TdoiDbPolFirePerilDTO tdoiDbPolFirePeril) {
		this.tdoiDbPolFirePeril = tdoiDbPolFirePeril;
	}
}
