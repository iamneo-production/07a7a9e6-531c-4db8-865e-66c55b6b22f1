package com.healthcare.claimprocessingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.claimprocessingservice.feignclient.InsuranceServiceProxy;
import com.healthcare.claimprocessingservice.service.ClaimProcessingService;
import com.healthcare.claimprocessingservicey.model.Claim;

@RestController
@RequestMapping("/claimprocessingcontroller")
public class ClaimProcessingController {
	
	
	@Autowired
	private InsuranceServiceProxy insuranceServiceproxy;
	
	@Autowired
	private ClaimProcessingService claimProcessingService;
	
	@PostMapping("/api/claim/process")
	public Claim claimRequestDetails(@RequestBody Claim claim) {
		Claim c1 =insuranceServiceproxy.checkClaimDetails(claim);
		return c1;
		 		
	}
}
