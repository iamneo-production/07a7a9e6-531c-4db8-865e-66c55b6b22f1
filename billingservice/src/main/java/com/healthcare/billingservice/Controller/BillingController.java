package com.healthcare.billingservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcare.billingservice.Entity.Bill;
import com.healthcare.billingservice.Service.BillingServiceImpl;


@RestController
@RequestMapping("/billing")
public class BillingController {

    @Autowired
    private BillingServiceImpl billService;

    @PostMapping("/create")
    public ResponseEntity<String> createBill(@RequestBody BillRequest billRequest){
        Bill bill = billService.createBill(billRequest.getPatientName(), billRequest.getAmount());
        
        String responseMessage = "Bill created successfully for the Patient: " + bill.getPatientName();
        return new ResponseEntity<>(responseMessage, HttpStatus.CREATED);
    }

}
