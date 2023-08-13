package com.healtcare.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healtcare.patientservice.entity.Claim;
import com.healtcare.patientservice.entity.Patient;
import com.healtcare.patientservice.feignClient.ClaimProcessingProxy;
import com.healtcare.patientservice.feignClient.HealthCareProviderProxy;
import com.healtcare.patientservice.model.HealthCareProvider;
import com.healtcare.patientservice.service.ClaimService;
import com.healtcare.patientservice.service.PatientService;

@RestController
public class PatientServiceController {
	
	@Autowired
	private HealthCareProviderProxy healthCareProviderProxy;
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private ClaimService claimService;
	
	@Autowired
	private ClaimProcessingProxy claimProcessingProxy;
	
	Claim claim1;
	
	@PostMapping("/api/patient/claim")
	public ResponseEntity<?> requestClaim(@RequestBody Claim claim) {
		HealthCareProvider hp = healthCareProviderProxy.getProviderDetails(claim.getHealthCareProviderId());
		
		Patient patient = patientService.getPatientDetails(claim.getPatientId());
		
		if(hp!=null && patient!=null) {
			 
		   claim1=claimService.saveClaimDetails(claim);
		   Claim c1 = claimProcessingProxy.claimRequestDetails(claim1);
		   claimService.saveClaimDetails(c1);
			
			return new ResponseEntity<String>("Claim is requested",HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("claim failed",HttpStatus.OK);
		
	}
	
	
	

}
