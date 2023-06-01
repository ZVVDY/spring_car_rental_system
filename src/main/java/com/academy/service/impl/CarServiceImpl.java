package com.academy.service.impl;

import com.academy.model.entity.Car;
import com.academy.model.repository.CarRepository;
import com.academy.model.repository.CarStatusRepository;
import com.academy.service.CarService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Data
@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;
    private final CarStatusRepository carStatusRepository;

    @Override
    public Car findCar(Integer id) {
        Car car = carRepository.getReferenceById(id);
        String model = car.getModel();
        Double costDay = car.getCostOfRentingOneDay();
        Integer idCar = car.getId();
        Car carReturn = new Car();
        carReturn.setId(idCar);
        carReturn.setModel(model);
        car.setCostOfRentingOneDay(costDay);
        return carReturn;
    }

}