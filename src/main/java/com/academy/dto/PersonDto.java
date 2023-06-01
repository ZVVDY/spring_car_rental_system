package com.academy.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class PersonDto {

    private Integer id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate dateRegistration;
    private String firstName;
    private String surname;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;
    private String passportNumber;
    private String email;
    private String phoneNumber;
    private String driverLicenseNumber;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfIssueOfTheDriverLicense;
    private Double drivingExperience;
    private Double moneyOnTheAccount;
    private UserDto userDto;
}
