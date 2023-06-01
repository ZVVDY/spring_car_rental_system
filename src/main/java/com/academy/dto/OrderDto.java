package com.academy.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
public class OrderDto {

    private Integer id;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate rentalStartDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate rentalEndDate;
    private Double orderAmount;
    private String massage;
    private PersonDto personDto;
    private CarDto carDto;
    private OrderStatusDto orderStatusDto;
    private PaymentStatusDto paymentStatusDto;
}
