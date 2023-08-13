package com.healtcare.patientservice.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.healtcare.patientservice.entity.Claim;



@FeignClient(name="claimprocessing-service")
public interface ClaimProcessingProxy {
	
	@PostMapping("/claimprocessingcontroller/api/claim/process")
	public Claim claimRequestDetails(@RequestBody Claim claim);

}
