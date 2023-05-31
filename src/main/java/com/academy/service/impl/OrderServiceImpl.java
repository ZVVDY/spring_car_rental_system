package com.academy.service.impl;

import com.academy.dto.CarDto;
import com.academy.dto.OrderDto;
import com.academy.dto.PersonDto;
import com.academy.mapper.OrderMapper;
import com.academy.mapper.PersonMapper;
import com.academy.model.entity.*;
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

    private final CarService carService;
    private final UserService userService;

    @Override
    public OrderDto findById(Integer id) {
        return null;
    }

    @Transactional
    @Override
    public void save(OrderDto orderDto) {
        LocalDate rentalStartDate = LocalDate.parse(orderDto.getRentalStartDate());
        LocalDate rentalEndDate = LocalDate.parse(orderDto.getRentalEndDate());
        Period period = Period.between(rentalStartDate, rentalEndDate);
        int dayRental = Math.abs(period.getDays());
        int timeRental = dayRental * 24;
        CarDto carDto = orderDto.getCarDto();
        int numberIdCar = carDto.getId();
        Car car = carRepository.getReferenceById(numberIdCar);
        CarStatus carStatus =carStatusRepository.getReferenceById(2);
        car.setCarStatus(carStatus);
        Double costDayCar = car.getCostOfRentingOneDay();
        Double costRental = timeRental * costDayCar;
        orderDto.setOrderAmount(costRental);
        Integer userId = userService.findUserIdSession();
        Person person = personRepository.getReferenceById(userId);
        OrderStatus orderStatus = orderStatusRepository.getReferenceById(2);
        orderStatus.setStatusOrder(orderStatus.getStatusOrder());
        PaymentStatus paymentStatus = paymentStatusRepository.getReferenceById(1);
        Order order = orderMapper.toEntity(orderDto);
        order.setPaymentStatus(paymentStatus);
        order.setPerson(person);
        order.setCar(car);
        order.setOrderStatus(orderStatus);
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

    }
}
