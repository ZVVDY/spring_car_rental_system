package com.academy.dto;

import com.academy.model.entity.Person;
import com.academy.model.entity.RolePerson;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
@Data
@RequiredArgsConstructor
public class UsersDto {

    private Integer id;
    private String login;
    private String password;
    private LocalDate dateOfRegistration;
    @Enumerated(EnumType.STRING)
    private RolePerson role;
    private Person person;
}
