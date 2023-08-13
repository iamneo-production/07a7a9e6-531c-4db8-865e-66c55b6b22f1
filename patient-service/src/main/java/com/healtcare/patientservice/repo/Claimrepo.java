package com.healtcare.patientservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healtcare.patientservice.entity.Claim;

public interface Claimrepo extends JpaRepository<Claim, Integer> {

}
