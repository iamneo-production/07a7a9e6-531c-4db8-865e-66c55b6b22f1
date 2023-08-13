package com.healthcare.insuranceservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.insuranceservice.entity.InsurancePolicy;
import com.healthcare.insuranceservice.model.Claim;
import com.healthcare.insuranceservice.repo.InsurancePolicyRepo;

@Service
public class InsuranceService {

	@Autowired
	InsurancePolicyRepo insuracePolicyRepo;
	
	public Claim checkClaimDetails(Claim claim) {
		InsurancePolicy insurance = insuracePolicyRepo.findById(claim.getPolicyId()).get();
		if(insurance.getInsurancePolicyNumber()==claim.getPolicyId() )
		{
			if(claim.getDateOfService().after(insurance.getCoverageStartDate()) && claim.getDateOfService().before(insurance.getCoverageEndDate()))
			{
				insurance.setDeductible(insurance.getDeductible()-claim.getAmountCharged());
				return claim;
			}
				
		}
		return null;
	}

}
