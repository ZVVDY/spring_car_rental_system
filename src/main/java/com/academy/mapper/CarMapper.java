package com.academy.mapper;

import com.academy.dto.CarDto;
import com.academy.model.entity.Car;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CarStatusMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CarMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "model", source = "model")
    @Mapping(target = "costOfRentingOneDay", source = "costOfRentingOneDay")
    @Mapping(target = "carStatusDto", source = "carStatus")
    CarDto toDto(Car car);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "model", source = "model")
    @Mapping(target = "costOfRentingOneDay", source = "costOfRentingOneDay")
    @Mapping(target = "carStatus", source = "carStatusDto")
    Car toEntity(CarDto carDto);

    List<CarDto> modelsToDto(List<Car> cars);

    List<Car> dtoToModels(List<CarDto> car);
}
