package com.healthcare.healthcareproviderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.healthcareproviderservice.entity.Healthcareprovider;
import com.healthcare.healthcareproviderservice.service.HealthCareProviderService;

@RestController
@RequestMapping("/healthCareProviderController")
public class HealthCareproviderController {
	
	@Autowired
	private HealthCareProviderService hcpservice;
	
	@PostMapping("/api/provider")
	public ResponseEntity<?> savehealthcareprovider(@RequestBody Healthcareprovider healthcareprovider)
	{
		Healthcareprovider hcp=hcpservice.saveProviderDetails(healthcareprovider);	
		return new ResponseEntity<String>("healthcare provider "+hcp.getHealthCareproviderId()+" "+"added",HttpStatus.OK);
	}
	
	@GetMapping("/getproviderdetails")
	public Healthcareprovider getProviderDetails(@RequestBody int id) {
		Healthcareprovider hcp= hcpservice.providerDetails(id);
		return hcp;
	}
	

}
