package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_acceptance")
public class OrderAcceptance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "presence_of_damage_car")
    private Boolean presenceOfDamageToTheCar;
    @Column(name = "type_of_damage_car")
    private String typeOfDamageToTheCar;
    @Column(name = "cost_of_car_repair")
    private Double costOfCarRepair;
    @Column(name = "car_id")
    @OneToOne
    private Car car;
    @OneToOne
    @Column(name = "order_status_id")
    private OrderStatus orderStatus;
    }
