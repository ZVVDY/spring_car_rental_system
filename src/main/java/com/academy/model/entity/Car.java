package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String model;
    @Column(name = "cost_renting_one_day")
    private Double costOfRentingOneDay;
    @Column(name = "person_id")
    private Person person;
    @Column(name = "car_status_id")
    private CarStatus carStatus;
}
