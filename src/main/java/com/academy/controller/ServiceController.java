package com.academy.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@RequiredArgsConstructor
public class ServiceController {
    @GetMapping(value = "/service")
    public String servicePage(Model model) {
        model.addAttribute("service", "Service Car");
        return "service";
    }
}
