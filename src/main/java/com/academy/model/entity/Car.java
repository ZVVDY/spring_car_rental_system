package com.academy.model.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "model")
    private String model;
    @Column(name = "cost_renting_one_day")
    private Double costOfRentingOneDay;
    @JoinColumn(name = "car_status_id")
    @ManyToOne
    private CarStatus carStatus;
}
