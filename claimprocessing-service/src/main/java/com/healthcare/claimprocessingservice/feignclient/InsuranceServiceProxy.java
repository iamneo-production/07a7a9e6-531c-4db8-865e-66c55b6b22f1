package com.healthcare.claimprocessingservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.healthcare.claimprocessingservicey.model.Claim;

@FeignClient(name="insurance-service")
public interface InsuranceServiceProxy {
	
	@PostMapping("/insuranceServiceController/api/insurance/claim")
	public Claim checkClaimDetails(@RequestBody Claim claim);

}
