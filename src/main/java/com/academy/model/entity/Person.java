package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "person")

//TODO
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "driver_license_number")
    private String driverLicenseNumber;
    @Column(name = "date_of_issue_driver_license")
    private Date dateOfIssueOfTheDriverLicense;
    @Column(name = "driving_experience")
    private Double drivingExperience;
    @Column(name = "money_on_the_account")
    private Double moneyOnTheAccount;
    }
