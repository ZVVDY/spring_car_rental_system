package com.academy.dto;

import com.academy.model.entity.PaymentStatus;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OrderDto {

    private Integer id;
    private String rentalStartDate;
    private String rentalEndDate;
    private Double orderAmount;
    private String massage;
    private PersonDto personDto;
    private CarDto carDto;
    private OrderStatusDto orderStatusDto;
    private PaymentStatusDto paymentStatusDto;
}
