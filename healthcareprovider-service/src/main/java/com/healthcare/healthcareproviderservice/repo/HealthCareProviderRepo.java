package com.healthcare.healthcareproviderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.healthcareproviderservice.entity.Healthcareprovider;

public interface HealthCareProviderRepo extends JpaRepository<Healthcareprovider, Integer> {

}
