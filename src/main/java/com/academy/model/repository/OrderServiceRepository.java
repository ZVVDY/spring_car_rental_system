package com.academy.model.repository;

import com.academy.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface OrderServiceRepository extends JpaRepository<Order, Integer> {
}
