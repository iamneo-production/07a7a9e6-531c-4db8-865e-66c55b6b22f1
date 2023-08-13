package com.healthcare.healthcareproviderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class Healthcareprovider {
	
	@Id
	private int healthCareproviderId;
	private String healthCareProviderName;
	private String address;
	private String phoneNumber;
	private String Specialization;
	private String insuranceCompanies;
	public int getHealthCareproviderId() {
		return healthCareproviderId;
	}
	public void setHealthCareprovider(int healthCareproviderId) {
		this.healthCareproviderId = healthCareproviderId;
	}
	public String getHealthCareProviderName() {
		return healthCareProviderName;
	}
	public void setHealthCareProviderName(String healthCareProviderName) {
		this.healthCareProviderName = healthCareProviderName;
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
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getInsuranceCompanies() {
		return insuranceCompanies;
	}
	public void setInsuranceCompanies(String insuranceCompanies) {
		this.insuranceCompanies = insuranceCompanies;
	}
	
	
	
	

}
