package com.academy.dto;

import com.academy.model.entity.Person;
import com.academy.model.entity.User;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class PersonDto {

    private Integer id;
    private LocalDate dateRegistration;
    private String firstName;
    private String surname;
    private Date dateOfBirth;
    private String passportNumber;
    private String email;
    private String phoneNumber;
    private String driverLicenseNumber;
    private Date dateOfIssueOfTheDriverLicense;
    private Double drivingExperience;
    private Double moneyOnTheAccount;
    private User user;
}
