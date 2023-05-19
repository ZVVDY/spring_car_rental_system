package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "cars")
@Component
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String model;
    @Column(name = "cost_renting_one_day")
    private Double costOfRentingOneDay;
    @JoinColumn(name = "car_status_id")
    @ManyToOne
    private CarStatus carStatus;
}
