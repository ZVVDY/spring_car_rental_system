package com.academy.controller;

import com.academy.dto.CarDto;
import com.academy.dto.OrderDto;
import com.academy.mapper.CarMapper;
import com.academy.mapper.OrderMapper;
import com.academy.model.entity.Car;
import com.academy.model.entity.Order;
import com.academy.model.entity.Person;
import com.academy.model.repository.CarRepository;
import com.academy.model.repository.OrderRepository;
import com.academy.model.repository.PersonRepository;
import com.academy.service.CarService;
import com.academy.service.OrderService;
import com.academy.service.PersonService;
import com.academy.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.apache.catalina.util.CharsetMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;
import java.util.List;

@Controller
@Data
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final CarRepository carRepository;
    private final PersonRepository personRepository;
    private final OrderRepository orderRepository;
    private  final UserService userService;
    private  final CarService carService;
    private  final PersonService personService;
    private final CarMapper carMapper;
    private final OrderMapper orderMapper;

    @GetMapping(value = "/orders")
    public String orderPage(Model model) {
        List<Order> orderList = orderRepository.findByPerson(personService.findById(userService
                .findUserIdSession()));
        List<OrderDto> orders = orderMapper.modelsToDto(orderList);

model.addAttribute("orderPerson", orders);
        return "orders";
    }

    @GetMapping(value = "/cars_orders/polo")
    public String poloOrderPage(@ModelAttribute("polo") OrderDto orderDto) {
        return "cars_orders/polo";
    }

    @PostMapping("/cars_orders/polo")
    public String formOrderPoloPage(@ModelAttribute("polo") OrderDto orderDto, Model model) throws ParseException {
        if (carService.carStatusNow(1)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/polo";
        }
        CarDto carDto = new CarDto();
        carDto.setId(1);
        orderDto.setCarDto(carDto);
        orderService.save(orderDto);
        return "cars_orders/polo";
    }
}