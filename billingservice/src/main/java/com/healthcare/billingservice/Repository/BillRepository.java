package com.healthcare.billingservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.billingservice.Entity.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
