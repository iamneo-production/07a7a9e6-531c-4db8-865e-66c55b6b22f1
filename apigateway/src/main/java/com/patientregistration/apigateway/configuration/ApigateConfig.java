package com.patientregistration.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApigateConfig {
	
	@Bean
	public RouteLocator getwayRouter(RouteLocatorBuilder builder) {

		return builder.routes()

		.route(patient->patient.path("/api/patient/claim/**").uri("lb://patient-service/api/patient/claim"))
		.route(healthcareprovider->healthcareprovider.path("/getproviderdetails/**").uri("lb://healthcareprovider-service/getproviderdetails"))
		.route(claimProcessing->claimProcessing.path("/api/claim/process/**").uri("lb://claimprocessing-service/api/claim/process"))
		.route(insurance->insurance.path("/api/insurance/claim/**").uri("lb://insurance-service/api/insurance/claim"))
		.route(bill->bill.path("/create/**").uri("lb://billing-service/create"))
		

		

		.build();

		 

		}
	

}
