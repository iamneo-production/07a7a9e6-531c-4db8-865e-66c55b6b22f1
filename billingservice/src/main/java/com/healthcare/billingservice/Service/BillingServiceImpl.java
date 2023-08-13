package com.healthcare.billingservice.Service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcare.billingservice.Entity.Bill;
import com.healthcare.billingservice.Repository.BillRepository;

@Service
public class BillingServiceImpl implements BillingService {

    @Autowired
    private BillRepository billRepository;

    @Override
    public Bill createBill(String patientName, BigDecimal amount){

        Bill bill = new Bill();
        bill.setPatientName(patientName);
        bill.setAmount(amount);
        bill.setCreatedAt(new Date());
        
        return billRepository.save(bill);

        
    }


}