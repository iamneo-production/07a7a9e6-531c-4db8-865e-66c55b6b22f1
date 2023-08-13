package com.healtcare.patientservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healtcare.patientservice.entity.Patient;

public interface Patientrepo extends JpaRepository<Patient, Integer>{

}
