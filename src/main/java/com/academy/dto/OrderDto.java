package com.academy.dto;

import com.academy.model.entity.Car;
import com.academy.model.entity.OrderStatus;
import com.academy.model.entity.Person;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OrderDto {

    private Integer id;
    private LocalDate rentalStartDate;
    private LocalDate rentalEndDate;
    private Double orderAmount;
    private Person person;
    private Car car;
    private OrderStatus orderStatus;
}
