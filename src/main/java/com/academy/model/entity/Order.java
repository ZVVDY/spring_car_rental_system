package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "rental_start_date")
    private Date rentalStartDate;
    @Column(name = "rental_end_date")
    private Date rentalEndDate;
    @Column(name = "driver_license_number")
    private String driverLicenseNumber;
    @Column(name = "date_of_issue_driver_license")
    private Date dateOfIssueOfTheDriverLicense;
    @Column(name = "driving_experience")
    private Double drivingExperience;
    @Column(name = "order_amount")
    private Double orderAmount;
    @Column(name = "person_id")
    @ManyToOne
    private Person person;
    @OneToOne
    @Column(name = "car_id")
    private Car car;
    @OneToOne
    @Column(name = "order_status_id")
    private OrderStatus orderStatus;
}
