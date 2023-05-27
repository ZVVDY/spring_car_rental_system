package com.academy.model.repository;

import com.academy.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CarRepository extends JpaRepository<Car,Integer> {
}
