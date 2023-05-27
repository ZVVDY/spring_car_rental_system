package com.academy.model.repository;

import com.academy.model.entity.CarStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CarStatusRepository extends JpaRepository<CarStatus, Integer> {
}
