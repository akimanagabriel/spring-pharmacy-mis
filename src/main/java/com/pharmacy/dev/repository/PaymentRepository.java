package com.pharmacy.dev.repository;

import com.pharmacy.dev.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
