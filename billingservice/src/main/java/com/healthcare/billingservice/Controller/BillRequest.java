package com.healthcare.billingservice.Controller;

import java.math.BigDecimal;

public class BillRequest {

    private String patientName;
    private BigDecimal amount;
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    

}
