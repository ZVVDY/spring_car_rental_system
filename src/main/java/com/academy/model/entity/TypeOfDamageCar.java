package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "type_of_damage_car")

public class TypeOfDamageCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type_of_damage_car")
    private String typeOfDamageToTheCar;
    @Column
    private String message;
    @Column(name = "cost_of_car_repair")
    private Double costOfCarRepair;
}
