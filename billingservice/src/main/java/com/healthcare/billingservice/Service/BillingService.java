package com.healthcare.billingservice.Service;

import java.math.BigDecimal;

import com.healthcare.billingservice.Entity.Bill;

public interface BillingService {

    Bill createBill(String patientName, BigDecimal amount);
    
}
