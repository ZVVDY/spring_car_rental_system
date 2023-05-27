package com.academy.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Data
@RequiredArgsConstructor
public class OrderController {
    @GetMapping(value = "/order")
    public String orderPage(Model model) {
        model.addAttribute("order", "Order Car");
        return "orders";
    }
}