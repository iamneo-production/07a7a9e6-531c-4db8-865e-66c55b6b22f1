package com.healthcare.insuranceservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InsuranceCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int insuranceCompanyId;
	private String insuranceCompanyName;
	private String address;
	private String phoneNumber;
	private String contractedHealthCareProviders;
	public int getInsuranceCompanyId() {
		return insuranceCompanyId;
	}
	public void setInsuranceCompanyId(int insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}
	public String getInsuranceCompanyName() {
		return insuranceCompanyName;
	}
	public void setInsuranceCompanyName(String insuranceCompanyName) {
		this.insuranceCompanyName = insuranceCompanyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getContractedHealthCareProviders() {
		return contractedHealthCareProviders;
	}
	public void setContractedHealthCareProviders(String contractedHealthCareProviders) {
		this.contractedHealthCareProviders = contractedHealthCareProviders;
	}
	
	

}
