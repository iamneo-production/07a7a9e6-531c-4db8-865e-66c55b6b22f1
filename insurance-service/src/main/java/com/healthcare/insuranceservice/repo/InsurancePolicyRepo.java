package com.healthcare.insuranceservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.insuranceservice.entity.InsurancePolicy;

public interface InsurancePolicyRepo  extends JpaRepository<InsurancePolicy, Integer>{

}
