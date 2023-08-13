package com.healthcare.insuranceservice.model;

import java.sql.Date;

public class Claim {

	private int claimId;
	private int patientId;
	private int healthCareProviderId;
	private Date dateOfService;
	private long amountCharged;
	private String insuranceCompany;
	private String claimStatus;
	private String policyName;
	private int policyId;
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getHealthCareProviderId() {
		return healthCareProviderId;
	}
	public void setHealthCareProviderId(int healthCareProviderId) {
		this.healthCareProviderId = healthCareProviderId;
	}
	
	public long getAmountCharged() {
		return amountCharged;
	}
	public void setAmountCharged(long amountCharged) {
		this.amountCharged = amountCharged;
	}
	public String getInsuranceCompany() {
		return insuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public Date getDateOfService() {
		return dateOfService;
	}
	public void setDateOfService(Date dateOfService) {
		this.dateOfService = dateOfService;
	}
	
	
	
}
