package com.academy.model.repository;

import com.academy.model.entity.Order;
import com.academy.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
        List<Order> findByPerson(Person person);
}
