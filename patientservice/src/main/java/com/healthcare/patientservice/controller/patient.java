package com.healthcare.patientservice.controller;

import lombok.Getter;
import lombok.Setter;

public class patient {
    
    @Getter
    @Setter
    private int PatientID;
    private String PatientName;
    private String Dob;
    private String Gender;
    private String Address;
    private Double PhoneNumber;
    private String InsuranceCompany;
    private int PolicyNumber;
    
    
    
}
