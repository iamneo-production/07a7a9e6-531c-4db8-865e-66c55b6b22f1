package com.healthcare.healthcareproviderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HealthcareproviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthcareproviderServiceApplication.class, args);
	}

}
