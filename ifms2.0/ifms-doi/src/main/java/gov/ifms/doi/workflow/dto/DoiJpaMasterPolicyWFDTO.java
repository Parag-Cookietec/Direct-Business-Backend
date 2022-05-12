package gov.ifms.doi.workflow.dto;

import gov.ifms.doi.jpa.entity.DoiJPAMasterPolicy;

/**
 * 
 * @author Sagar Jadhav
 *
 */
public class DoiJpaMasterPolicyWFDTO {

	private long jpaPolicyMstWfId;
	private DoiJPAMasterPolicy doiJPAMasterPolicy;
	private long actionconfigId;
	private long wfActionId;
	private long assignToWfRoleId;
	private long assignToUserId;
	private long assignToPostId;
	private long assignToPouId;
	private long assignToOfficeId;
	private long assignToBranchId;
	private long assignToGroupId;
	private String wfStatus;
	private String trnStatus;
	private long assignByWfRoleId;
	private long assignByUserId;
	private long assignByPostId;
	private long assignByPouId;
	private long assignByOfficeId;
	private long assignByBranchId;
	private long assignByGroupId;
	private String remarks;
	private short sendBackFlag;
	private short counter;
	private short subCounter;
	private short level;
	private short refColSmallint;
	private String refColVarchar;
	private String refColOther;

	/**
	 * @return the jpaPolicyMstWfId
	 */
	public long getJpaPolicyMstWfId() {
		return jpaPolicyMstWfId;
	}

	/**
	 * @param jpaPolicyMstWfId the jpaPolicyMstWfId to set
	 */
	public void setJpaPolicyMstWfId(long jpaPolicyMstWfId) {
		this.jpaPolicyMstWfId = jpaPolicyMstWfId;
	}

	/**
	 * @return the doiJPAMasterPolicy
	 */
	public DoiJPAMasterPolicy getDoiJPAMasterPolicy() {
		return doiJPAMasterPolicy;
	}

	/**
	 * @param doiJPAMasterPolicy the doiJPAMasterPolicy to set
	 */
	public void setDoiJPAMasterPolicy(DoiJPAMasterPolicy doiJPAMasterPolicy) {
		this.doiJPAMasterPolicy = doiJPAMasterPolicy;
	}

	/**
	 * @return the actionconfigId
	 */
	public long getActionconfigId() {
		return actionconfigId;
	}

	/**
	 * @param actionconfigId the actionconfigId to set
	 */
	public void setActionconfigId(long actionconfigId) {
		this.actionconfigId = actionconfigId;
	}

	/**
	 * @return the wfActionId
	 */
	public long getWfActionId() {
		return wfActionId;
	}

	/**
	 * @param wfActionId the wfActionId to set
	 */
	public void setWfActionId(long wfActionId) {
		this.wfActionId = wfActionId;
	}

	/**
	 * @return the assignToWfRoleId
	 */
	public long getAssignToWfRoleId() {
		return assignToWfRoleId;
	}

	/**
	 * @param assignToWfRoleId the assignToWfRoleId to set
	 */
	public void setAssignToWfRoleId(long assignToWfRoleId) {
		this.assignToWfRoleId = assignToWfRoleId;
	}

	/**
	 * @return the assignToUserId
	 */
	public long getAssignToUserId() {
		return assignToUserId;
	}

	/**
	 * @param assignToUserId the assignToUserId to set
	 */
	public void setAssignToUserId(long assignToUserId) {
		this.assignToUserId = assignToUserId;
	}

	/**
	 * @return the assignToPostId
	 */
	public long getAssignToPostId() {
		return assignToPostId;
	}

	/**
	 * @param assignToPostId the assignToPostId to set
	 */
	public void setAssignToPostId(long assignToPostId) {
		this.assignToPostId = assignToPostId;
	}

	/**
	 * @return the assignToPouId
	 */
	public long getAssignToPouId() {
		return assignToPouId;
	}

	/**
	 * @param assignToPouId the assignToPouId to set
	 */
	public void setAssignToPouId(long assignToPouId) {
		this.assignToPouId = assignToPouId;
	}

	/**
	 * @return the assignToOfficeId
	 */
	public long getAssignToOfficeId() {
		return assignToOfficeId;
	}

	/**
	 * @param assignToOfficeId the assignToOfficeId to set
	 */
	public void setAssignToOfficeId(long assignToOfficeId) {
		this.assignToOfficeId = assignToOfficeId;
	}

	/**
	 * @return the assignToBranchId
	 */
	public long getAssignToBranchId() {
		return assignToBranchId;
	}

	/**
	 * @param assignToBranchId the assignToBranchId to set
	 */
	public void setAssignToBranchId(long assignToBranchId) {
		this.assignToBranchId = assignToBranchId;
	}

	/**
	 * @return the assignToGroupId
	 */
	public long getAssignToGroupId() {
		return assignToGroupId;
	}

	/**
	 * @param assignToGroupId the assignToGroupId to set
	 */
	public void setAssignToGroupId(long assignToGroupId) {
		this.assignToGroupId = assignToGroupId;
	}

	/**
	 * @return the wfStatus
	 */
	public String getWfStatus() {
		return wfStatus;
	}

	/**
	 * @param wfStatus the wfStatus to set
	 */
	public void setWfStatus(String wfStatus) {
		this.wfStatus = wfStatus;
	}

	/**
	 * @return the trnStatus
	 */
	public String getTrnStatus() {
		return trnStatus;
	}

	/**
	 * @param trnStatus the trnStatus to set
	 */
	public void setTrnStatus(String trnStatus) {
		this.trnStatus = trnStatus;
	}

	/**
	 * @return the assignByWfRoleId
	 */
	public long getAssignByWfRoleId() {
		return assignByWfRoleId;
	}

	/**
	 * @param assignByWfRoleId the assignByWfRoleId to set
	 */
	public void setAssignByWfRoleId(long assignByWfRoleId) {
		this.assignByWfRoleId = assignByWfRoleId;
	}

	/**
	 * @return the assignByUserId
	 */
	public long getAssignByUserId() {
		return assignByUserId;
	}

	/**
	 * @param assignByUserId the assignByUserId to set
	 */
	public void setAssignByUserId(long assignByUserId) {
		this.assignByUserId = assignByUserId;
	}

	/**
	 * @return the assignByPostId
	 */
	public long getAssignByPostId() {
		return assignByPostId;
	}

	/**
	 * @param assignByPostId the assignByPostId to set
	 */
	public void setAssignByPostId(long assignByPostId) {
		this.assignByPostId = assignByPostId;
	}

	/**
	 * @return the assignByPouId
	 */
	public long getAssignByPouId() {
		return assignByPouId;
	}

	/**
	 * @param assignByPouId the assignByPouId to set
	 */
	public void setAssignByPouId(long assignByPouId) {
		this.assignByPouId = assignByPouId;
	}

	/**
	 * @return the assignByOfficeId
	 */
	public long getAssignByOfficeId() {
		return assignByOfficeId;
	}

	/**
	 * @param assignByOfficeId the assignByOfficeId to set
	 */
	public void setAssignByOfficeId(long assignByOfficeId) {
		this.assignByOfficeId = assignByOfficeId;
	}

	/**
	 * @return the assignByBranchId
	 */
	public long getAssignByBranchId() {
		return assignByBranchId;
	}

	/**
	 * @param assignByBranchId the assignByBranchId to set
	 */
	public void setAssignByBranchId(long assignByBranchId) {
		this.assignByBranchId = assignByBranchId;
	}

	/**
	 * @return the assignByGroupId
	 */
	public long getAssignByGroupId() {
		return assignByGroupId;
	}

	/**
	 * @param assignByGroupId the assignByGroupId to set
	 */
	public void setAssignByGroupId(long assignByGroupId) {
		this.assignByGroupId = assignByGroupId;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * @return the sendBackFlag
	 */
	public short getSendBackFlag() {
		return sendBackFlag;
	}

	/**
	 * @param sendBackFlag the sendBackFlag to set
	 */
	public void setSendBackFlag(short sendBackFlag) {
		this.sendBackFlag = sendBackFlag;
	}

	/**
	 * @return the counter
	 */
	public short getCounter() {
		return counter;
	}

	/**
	 * @param counter the counter to set
	 */
	public void setCounter(short counter) {
		this.counter = counter;
	}

	/**
	 * @return the subCounter
	 */
	public short getSubCounter() {
		return subCounter;
	}

	/**
	 * @param subCounter the subCounter to set
	 */
	public void setSubCounter(short subCounter) {
		this.subCounter = subCounter;
	}

	/**
	 * @return the level
	 */
	public short getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(short level) {
		this.level = level;
	}

	/**
	 * @return the refColSmallint
	 */
	public short getRefColSmallint() {
		return refColSmallint;
	}

	/**
	 * @param refColSmallint the refColSmallint to set
	 */
	public void setRefColSmallint(short refColSmallint) {
		this.refColSmallint = refColSmallint;
	}

	/**
	 * @return the refColVarchar
	 */
	public String getRefColVarchar() {
		return refColVarchar;
	}

	/**
	 * @param refColVarchar the refColVarchar to set
	 */
	public void setRefColVarchar(String refColVarchar) {
		this.refColVarchar = refColVarchar;
	}

	/**
	 * @return the refColOther
	 */
	public String getRefColOther() {
		return refColOther;
	}

	/**
	 * @param refColOther the refColOther to set
	 */
	public void setRefColOther(String refColOther) {
		this.refColOther = refColOther;
	}

}
