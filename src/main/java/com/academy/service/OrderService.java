package com.academy.service;

import com.academy.dto.OrderDto;
import com.academy.dto.PersonDto;

import java.text.ParseException;
import java.util.List;

public interface OrderService {
    OrderDto findById(Integer id);

    void save(OrderDto orderDto) throws ParseException;

    List<OrderDto> findByOrderId(Integer id);

    List<OrderDto> findCompletedUser(Integer id);

    List<OrderDto> findByPerson(PersonDto personDto);

    public List<OrderDto> findOrderPerson(Integer id);

    void deleteOrder(Integer id);
}
