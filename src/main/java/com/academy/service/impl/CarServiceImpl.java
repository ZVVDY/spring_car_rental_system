package com.academy.service.impl;

import com.academy.model.entity.Car;
import com.academy.model.entity.CarStatus;
import com.academy.model.repository.CarRepository;
import com.academy.model.repository.CarStatusRepository;
import com.academy.service.CarService;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public boolean carStatusNow(Integer idCar) {
        Car car = carRepository.getReferenceById(idCar);
        CarStatus carStatus = car.getCarStatus();
        Integer statusCar = carStatus.getId();
        if (statusCar == 2 || statusCar==3) {
            return true;
        }
        return false;
    }
}