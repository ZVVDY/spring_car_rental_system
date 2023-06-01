package com.academy.model.repository;

import com.academy.model.entity.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentStatusRepository extends JpaRepository<PaymentStatus, Integer> {
}
