package com.healthcare.insuranceservice.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class InsurancePolicy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int insurancePolicyNumber;
	private int patientId;
	private int insuranceCompanyName;
	private Date coverageStartDate;
	private Date coverageEndDate;
	private long deductible;
	public int getInsurancePolicyNumber() {
		return insurancePolicyNumber;
	}
	public void setInsurancePolicyNumber(int insurancePolicyNumber) {
		this.insurancePolicyNumber = insurancePolicyNumber;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public int getInsuranceCompanyName() {
		return insuranceCompanyName;
	}
	public void setInsuranceCompanyName(int insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}
	public Date getCoverageStartDate() {
		return coverageStartDate;
	}
	public void setCoverageStartDate(Date coverageStartDate) {
		this.coverageStartDate = coverageStartDate;
	}
	public Date getCoverageEndDate() {
		return coverageEndDate;
	}
	public void setCoverageEndDate(Date coverageEndDate) {
		this.coverageEndDate = coverageEndDate;
	}
	public long getDeductible() {
		return deductible;
	}
	public void setDeductible(long deductible) {
		this.deductible = deductible;
	}
	
	
	

}
