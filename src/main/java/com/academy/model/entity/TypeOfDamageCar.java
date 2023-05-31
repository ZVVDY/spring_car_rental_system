package com.academy.model.entity;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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
