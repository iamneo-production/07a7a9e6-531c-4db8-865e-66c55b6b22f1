package com.healthcare.insuranceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.insuranceservice.model.Claim;
import com.healthcare.insuranceservice.service.InsuranceService;


@RestController
@RequestMapping("/insuranceServiceController")
public class InsuranceServiceController {
	@Autowired 
	InsuranceService insuranceService;
	
	@PostMapping("/api/insurance/claim")
	public Claim checkClaimDetails(@RequestBody Claim claim) {
		Claim claim1= insuranceService.checkClaimDetails(claim);
		return claim1;
		
		
	}

}
