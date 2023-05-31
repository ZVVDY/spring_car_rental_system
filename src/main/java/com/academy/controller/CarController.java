package com.academy.controller;

import com.academy.dto.OrderDto;
import com.academy.dto.PersonDto;
import com.academy.service.OrderService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;

@Controller
@Data
@RequiredArgsConstructor
public class CarController {
    @GetMapping(value = "/cars")
    public String homePage(Model model) {
        model.addAttribute("cars", "Cars Sharing");
        return "cars";
    }
}