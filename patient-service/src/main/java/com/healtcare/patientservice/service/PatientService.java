package com.healtcare.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healtcare.patientservice.entity.Patient;
import com.healtcare.patientservice.repo.Patientrepo;

@Service
public class PatientService {
	@Autowired
	private Patientrepo patientrepo;
	 
	
	public Patient getPatientDetails(int id) {
		Patient patient = patientrepo.findById(id).get();
		return patient;	
	}
	

}
