package com.academy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class RegistrationController {
    @GetMapping(value = "/registration")
    public String registrationPage(Model model) {
        model.addAttribute("registration", "Registration");
        return "registration";
    }
}
