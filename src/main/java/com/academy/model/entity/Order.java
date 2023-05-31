package com.academy.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "rental_start_date")
    private LocalDate rentalStartDate;
    @Column(name = "rental_end_date")
    private LocalDate rentalEndDate;
    @Column(name = "order_amount")
    private Double orderAmount;
    @Column(name = "massage")
    private String massage;
    @JoinColumn(name = "person_id")
    @ManyToOne
    private Person person;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name = "order_status_id")
    private OrderStatus orderStatus;
    @ManyToOne
    @JoinColumn(name = "payment_status_id")
    private PaymentStatus paymentStatus;
}
