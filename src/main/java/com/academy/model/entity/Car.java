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
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String model;
    @Column(name = "cost_renting_one_day")
    private Double costOfRentingOneDay;
    @Column(name = "person_id")
    @OneToMany
    private Person person;
    @Column(name = "car_status_id")
    private CarStatus carStatus;
}
