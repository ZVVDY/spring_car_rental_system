package com.academy.model.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "person")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "date_registration")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateRegistration;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "driver_license_number")
    private String driverLicenseNumber;
    @Column(name = "date_of_issue_driver_license")
    private LocalDate dateOfIssueOfTheDriverLicense;
    @Column(name = "driving_experience")
    private Double drivingExperience;
    @Column(name = "money_on_the_account")
    private Double moneyOnTheAccount;
    //@MapsId
    @JoinColumn(name = "user_id")
    @OneToOne
    private User user;
}
