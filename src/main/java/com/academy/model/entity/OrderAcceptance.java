package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_acceptance")
public class OrderAcceptance {
    private Integer id;
    @Column(name = "presence_of_damage_car")
    private Boolean presenceOfDamageToTheCar;
    @Column(name = "type_of_damage_car")
    private String typeOfDamageToTheCar;
    @Column(name = "cost_of_car_repair")
    private Double costOfCarRepair;
    @Column(name = "car_id")
    private Car car;
    }
