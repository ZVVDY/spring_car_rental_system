package com.academy.controller;

import com.academy.dto.CarDto;
import com.academy.dto.OrderDto;
import com.academy.mapper.CarMapper;
import com.academy.mapper.OrderMapper;
import com.academy.model.entity.Order;
import com.academy.model.repository.CarRepository;
import com.academy.model.repository.OrderRepository;
import com.academy.model.repository.PersonRepository;
import com.academy.service.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    private final UserService userService;
    private final CarService carService;
    private final PersonService personService;
    private final CarStatus carStatus;
    private final CarMapper carMapper;
    private final OrderMapper orderMapper;

    @GetMapping(value = "/orders")
    public String orderPage(Model model) {
        List<Order> orderList = orderRepository.findByPerson(personService.findById(userService
                .findUserIdSession()));
        List<OrderDto> orders = orderMapper.modelsToDto(orderList);
        model.addAttribute("ordersAll", orders);
        return "orders";
    }

    @GetMapping(value = "/cars_orders/polo")
    public String poloOrderPage(@ModelAttribute("polo") OrderDto orderDto, Model model) {
        if (carStatus.carStatusNow(1)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/polo";
        }
        if (!carStatus.carStatusNow(1)) {
            model.addAttribute("CarError", "The car is free for order");
            return "cars_orders/polo";
        }
        return "cars_orders/polo";
    }

    @PostMapping("/cars_orders/polo")
    public String formOrderPoloPage(@ModelAttribute("polo") OrderDto orderDto, Model model) throws ParseException {
        if (carStatus.carStatusNow(1)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/polo";
        }
        CarDto carDto = new CarDto();
        carDto.setId(1);
        orderDto.setCarDto(carDto);
        orderService.save(orderDto);
        return "cars_orders/polo";
    }

    @GetMapping(value = "/cars_orders/skoda")
    public String skodaOrderPage(@ModelAttribute("skoda") OrderDto orderDto, Model model) {
        if (carStatus.carStatusNow(2)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/skoda";
        }
        if (!carStatus.carStatusNow(2)) {
            model.addAttribute("CarError", "The car is free for order");
            return "cars_orders/skoda";
        }
        return "cars_orders/skoda";
    }

    @PostMapping("/cars_orders/skoda")
    public String formOrderSkodaPage(@ModelAttribute("skoda") OrderDto orderDto, Model model) throws ParseException {
        if (carStatus.carStatusNow(2)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/skoda";
        }
        CarDto carDto = new CarDto();
        carDto.setId(2);
        orderDto.setCarDto(carDto);
        orderService.save(orderDto);
        return "cars_orders/skoda";
    }

    @GetMapping(value = "/cars_orders/kia")
    public String kiaOrderPage(@ModelAttribute("kia") OrderDto orderDto, Model model) {
        if (carStatus.carStatusNow(3)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/kia";
        }
        if (!carStatus.carStatusNow(3)) {
            model.addAttribute("CarError", "The car is free for order");
            return "cars_orders/kia";
        }
        return "cars_orders/kia";
    }

    @PostMapping("/cars_orders/kia")
    public String formOrderKiaPage(@ModelAttribute("kia") OrderDto orderDto, Model model) throws ParseException {
        if (carStatus.carStatusNow(3)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/kia";
        }
        CarDto carDto = new CarDto();
        carDto.setId(3);
        orderDto.setCarDto(carDto);
        orderService.save(orderDto);
        return "cars_orders/kia";
    }

    @GetMapping(value = "/cars_orders/gelly_atlas")
    public String gellyAtlasOrderPage(@ModelAttribute("gelly_atlas") OrderDto orderDto, Model model) {
        if (carStatus.carStatusNow(4)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/gelly_atlas";
        }
        if (!carStatus.carStatusNow(4)) {
            model.addAttribute("CarError", "The car is free for order");
            return "cars_orders/gelly_atlas";
        }
        return "cars_orders/gelly_atlas";
    }

    @PostMapping("/cars_orders/gelly_atlas")
    public String formOrderGellyAtlasPage(@ModelAttribute("gelly_atlas") OrderDto orderDto, Model model) throws ParseException {
        if (carStatus.carStatusNow(4)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/gelly_atlas";
        }
        CarDto carDto = new CarDto();
        carDto.setId(4);
        orderDto.setCarDto(carDto);
        orderService.save(orderDto);
        return "cars_orders/gelly_atlas";
    }

    @GetMapping(value = "/cars_orders/gelly_tugella")
    public String gellyTugellaOrderPage(@ModelAttribute("gelly_tugella") OrderDto orderDto, Model model) {
        if (carStatus.carStatusNow(5)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/gelly_tugella";
        }
        if (!carStatus.carStatusNow(5)) {
            model.addAttribute("CarError", "The car is free for order");
            return "cars_orders/gelly_tugella";
        }
        return "cars_orders/gelly_tugella";
    }

    @PostMapping("/cars_orders/gelly_tugella")
    public String formOrderGellyTugellaPage(@ModelAttribute("gelly_tugella") OrderDto orderDto, Model model) throws ParseException {
        if (carStatus.carStatusNow(5)) {
            model.addAttribute("CarError", "The  car is busy, choose another car");
            return "cars_orders/gelly_atlas";
        }
        CarDto carDto = new CarDto();
        carDto.setId(5);
        orderDto.setCarDto(carDto);
        orderService.save(orderDto);
        return "cars_orders/gelly_tugella";
    }

    @GetMapping("/delete")
    public String deleteOrderCar(@RequestParam(value = "id") String id) {
        Integer idOrder = Integer.parseInt(id);
        orderService.deleteOrder(idOrder);
        return "redirect:/orders";
    }
}