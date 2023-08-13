package com.healthcare.insuranceservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.insuranceservice.entity.InsuranceCompany;

public interface InsuranceCompanyRepo extends JpaRepository<InsuranceCompany, Integer>{
	
	

}
