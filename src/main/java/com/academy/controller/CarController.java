package com.academy.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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