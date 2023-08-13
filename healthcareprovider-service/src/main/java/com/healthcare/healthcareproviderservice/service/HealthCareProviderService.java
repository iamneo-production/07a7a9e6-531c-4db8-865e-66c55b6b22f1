package com.healthcare.healthcareproviderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.healthcareproviderservice.entity.Healthcareprovider;
import com.healthcare.healthcareproviderservice.repo.HealthCareProviderRepo;

@Service
public class HealthCareProviderService {

	@Autowired
	private HealthCareProviderRepo hcprepo;
	
	
	public Healthcareprovider providerDetails(int id) {		
		Healthcareprovider hcp=hcprepo.findById(id).get();
		return hcp;
		
	}
	
	public Healthcareprovider saveProviderDetails(Healthcareprovider provider) {
		Healthcareprovider hcp = hcprepo.save(provider);
		return hcp;		
	}
}