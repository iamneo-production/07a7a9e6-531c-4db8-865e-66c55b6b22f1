package com.healtcare.patientservice.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.healtcare.patientservice.model.HealthCareProvider;



@FeignClient(name="healthcareprovider-service")
public interface HealthCareProviderProxy {
	@GetMapping("/healthCareProviderController/getproviderdetails")
	public HealthCareProvider getProviderDetails(@RequestBody int id);

}
