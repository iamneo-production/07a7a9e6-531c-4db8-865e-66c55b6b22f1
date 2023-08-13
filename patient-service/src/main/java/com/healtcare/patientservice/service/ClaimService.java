package com.healtcare.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healtcare.patientservice.entity.Claim;
import com.healtcare.patientservice.repo.Claimrepo;

@Service
public class ClaimService {

	@Autowired
	private Claimrepo claimrepo;
	
	public Claim saveClaimDetails(Claim claim) {
	Claim claim1 =claimrepo.save(claim);
	return claim1;
		
	}
	
}
