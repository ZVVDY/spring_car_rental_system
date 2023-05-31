package com.academy.mapper;

import com.academy.dto.OrderDto;
import com.academy.model.entity.Order;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class, PersonMapper.class, CarMapper.class,
        OrderStatusMapper.class, PaymentStatusMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface OrderMapper {
    OrderDto toDto(Order model);

    Order toEntity(OrderDto ordersDto);

    List<OrderDto> modelsToDto(List<Order> orders);

    List<Order> dtoToModels(List<OrderDto> orderDto);
}
