package com.healtcare.patientservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
	private int patientId;
	private String patientName;
	private String dateOfBirth;
	private String gender;
	private String address;
	private String phoneNumber;
	private String insuranceCompany;
	private String insurancePolicyNumber;
		

}
