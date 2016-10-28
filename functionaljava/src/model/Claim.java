package model;


public class Claim {
	
	int claimId;
	String memberId;
	String memberFirstName;
	double claimAmount;
	String admissionDate;
	
	
	/**
	 * @return the claimId
	 */
	public int getClaimId() {
		return claimId;
	}
	/**
	 * @param claimId the claimId to set
	 */
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the meberFirstName
	 */
	public String getMemberFirstName() {
		return memberFirstName;
	}
	/**
	 * @param meberFirstName the meberFirstName to set
	 */
	public void setMemberFirstName(String memberFirstName) {
		this.memberFirstName = memberFirstName;
	}
	/**
	 * @return the claimAmount
	 */
	public double getClaimAmount() {
		return claimAmount;
	}
	/**
	 * @param claimAmount the claimAmount to set
	 */
	public void setClaimAmount(double claimAmount) {
		this.claimAmount = claimAmount;
	}
	/**
	 * @return the admissionDate
	 */
	public String getAdmissionDate() {
		return admissionDate;
	}
	/**
	 * @param admissionDate the admissionDate to set
	 */
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	
	public Claim(int claimId, String memberId, String memberFirstName , double claimAmount, String admissionDate) {
		this.claimId = claimId;
		this.memberId = memberId;
		this.memberFirstName = memberFirstName;
		this.claimAmount = claimAmount;
		this.admissionDate = admissionDate;		
	}
	
	public String toString() {
		return claimId+"|"+memberId+"|"+memberFirstName+"|"+claimAmount+"|"+admissionDate;
	}

}
