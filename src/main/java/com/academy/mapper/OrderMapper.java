package com.academy.mapper;

import com.academy.dto.OrderDto;
import com.academy.model.entity.Order;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class, PersonMapper.class, CarMapper.class,
        OrderStatusMapper.class, PaymentStatusMapper.class, CarStatusMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "rentalStartDate", source = "rentalStartDate")
    @Mapping(target = "rentalEndDate", source = "rentalEndDate")
    @Mapping(target = "orderAmount", source = "orderAmount")
    @Mapping(target = "massage", source = "massage")
    @Mapping(target = "personDto", source = "person")
    @Mapping(target = "carDto", source = "car")
    @Mapping(target = "orderStatusDto", source = "orderStatus")
    @Mapping(target = "paymentStatusDto", source = "paymentStatus")
    OrderDto toDto(Order order);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "rentalStartDate", source = "rentalStartDate")
    @Mapping(target = "rentalEndDate", source = "rentalEndDate")
    @Mapping(target = "orderAmount", source = "orderAmount")
    @Mapping(target = "massage", source = "massage")
    @Mapping(target = "person", source = "personDto")
    @Mapping(target = "car", source = "carDto")
    @Mapping(target = "orderStatus", source = "orderStatusDto")
    @Mapping(target = "paymentStatus", source = "paymentStatusDto")
    Order toEntity(OrderDto ordersDto);

    List<OrderDto> modelsToDto(List<Order> orders);

    List<Order> dtoToModels(List<OrderDto> orderDtos);
}
