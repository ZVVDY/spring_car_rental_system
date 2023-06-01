package com.academy.service.impl;

import com.academy.model.entity.Car;
import com.academy.model.repository.CarRepository;
import com.academy.service.CarStatus;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Data
@Service
public class CarStatusImpl implements CarStatus {
    private final CarRepository carRepository;

    @Override
    public boolean carStatusNow(Integer idCar) {
        Car car = carRepository.getReferenceById(idCar);
        com.academy.model.entity.CarStatus carStatus = car.getCarStatus();
        Integer statusCar = carStatus.getId();
        if (statusCar == 2 || statusCar == 3) {
            return true;
        }
        return false;
    }
}
