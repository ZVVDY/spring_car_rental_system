package com.academy.model.repository;

import com.academy.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Integer> {

    Car getReferenceById(Integer id);

    ;
}
