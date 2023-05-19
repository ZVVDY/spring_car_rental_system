package com.academy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @ManyToOne
    private Order order;
    @OneToOne
    @JoinColumn(name = "tape_of_damadge_car_id")
    private TypeOfDamageCar typeOfDamageCar;
}
