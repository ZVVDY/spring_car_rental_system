package com.academy.dto;

import com.academy.model.entity.CarStatus;
import com.academy.model.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    private Integer id;
    private String model;
    private Double costOfRentingOneDay;
    private CarStatus carStatus;
}
