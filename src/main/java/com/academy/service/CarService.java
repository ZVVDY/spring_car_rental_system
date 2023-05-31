package com.academy.service;

import com.academy.model.entity.Car;

public interface CarService {
    public Car findCar(Integer id);
    boolean carStatusNow(Integer idCar);
}
