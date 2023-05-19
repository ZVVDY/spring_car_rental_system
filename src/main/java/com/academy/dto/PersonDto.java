package com.academy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
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
}
