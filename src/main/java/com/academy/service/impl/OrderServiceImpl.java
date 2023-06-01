package com.academy.service.impl;

import com.academy.dto.*;
import com.academy.mapper.*;
import com.academy.model.entity.Order;
import com.academy.model.repository.*;
import com.academy.service.CarService;
import com.academy.service.OrderService;
import com.academy.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Data
@Service
public class OrderServiceImpl implements OrderService {

    private final PersonRepository personRepository;

    private final CarRepository carRepository;

    private final OrderRepository orderRepository;

    private final OrderStatusRepository orderStatusRepository;

    private final PaymentStatusRepository paymentStatusRepository;

    private final CarStatusRepository carStatusRepository;

    private final OrderMapper orderMapper;
    private final PersonMapper personMapper;
    private final CarMapper carMapper;
    private final CarStatusMapper carStatusMapper;
    private final OrderStatusMapper orderStatusMapper;
    private final PaymentStatusMapper paymentStatusMapper;

    private final CarService carService;
    private final UserService userService;

    @Override
    public OrderDto findById(Integer id) {
        return null;
    }

    @Transactional
    @Override
    public void save(OrderDto orderDto) {
        LocalDate rentalStartDate = orderDto.getRentalStartDate();
        LocalDate rentalEndDate = orderDto.getRentalEndDate();
//        LocalDate rentalEndDate = LocalDate.ofEpochDay(Long.parseLong(orderDto.getRentalEndDate()));
        //long hours = ChronoUnit.HOURS.between(rentalStartDate, rentalEndDate);
        Period period = Period.between(rentalStartDate, rentalEndDate);
        int dayRental = Math.abs(period.getDays());
        int timeRental = dayRental * 24;
        CarDto carDtoOrder = orderDto.getCarDto();
        int numberIdCar = carDtoOrder.getId();
        CarDto carDto = carMapper.toDto(carRepository.getReferenceById(numberIdCar));
        CarStatusDto carStatusDto = carStatusMapper.toDto(carStatusRepository.getReferenceById(2));
        carDto.setCarStatusDto(carStatusDto);
        Double costDayCar = carDto.getCostOfRentingOneDay();
        Double costRental = timeRental * costDayCar;
        orderDto.setOrderAmount(costRental);
        Integer userId = userService.findUserIdSession();
        PersonDto personDto = personMapper.toDto(personRepository.getReferenceById(userId));
        OrderStatusDto orderStatusDto = orderStatusMapper.toDto(orderStatusRepository.getReferenceById(2));
        orderStatusDto.setStatusOrder(orderStatusDto.getStatusOrder());
        PaymentStatusDto paymentStatusDto = paymentStatusMapper.toDto(paymentStatusRepository.getReferenceById(1));
        orderDto.setPaymentStatusDto(paymentStatusDto);
        orderDto.setPersonDto(personDto);
        orderDto.setCarDto(carDto);
        orderDto.setOrderStatusDto(orderStatusDto);
        Order order = orderMapper.toEntity(orderDto);
        orderRepository.save(order);
    }

    @Override
    public List<OrderDto> findByOrderId(Integer id) {
        return null;
    }

    @Override
    public List<OrderDto> findCompletedUser(Integer id) {
        return null;
    }

    //TODO
    @Override
    public List<OrderDto> findByPerson(PersonDto personDto) {
        personDto = personMapper.toDto(personRepository.getReferenceById(userService.findUserIdSession()));
        return null;
    }

    @Override
    public List<OrderDto> findOrderPerson(Integer id) {
        PersonDto personDto = personMapper.toDto(personRepository.getReferenceById(userService.findUserIdSession()));
        List<OrderDto> orderDto = orderMapper.modelsToDto(orderRepository.findAll());
        List<OrderDto> orderPerson = new ArrayList<>();
        for (OrderDto o : orderDto) {
            int orderNumber = 1;
            if (o.getPersonDto().equals(personDto)) {
                orderPerson.set(orderNumber, o);
                orderNumber++;
            }

        }
        return orderPerson;
    }

    @Override
    public void deleteOrder(Integer id) {
        int i = id;
        OrderDto dto;
    }
}
