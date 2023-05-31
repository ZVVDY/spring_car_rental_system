package com.academy.dto;

import com.academy.model.entity.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class PersonDto {

    private Integer id;
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private LocalDate dateRegistration;
    private String firstName;
    private String surname;
    private String dateOfBirth;
    private String passportNumber;
    private String email;
    private String phoneNumber;
    private String driverLicenseNumber;
    private String dateOfIssueOfTheDriverLicense;
    private Double drivingExperience;
    private Double moneyOnTheAccount;
    private UserDto userdto;
}
