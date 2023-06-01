package com.academy.model.repository;

import com.academy.model.entity.Person;
import com.academy.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Integer> {
    User findByUser_Id(Integer userId);
}
