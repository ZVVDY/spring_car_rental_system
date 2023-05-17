package com.academy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequiredArgsConstructor
public class LoginController {
    @GetMapping(value = "/login")
    public String registrationPage(Model model) {
        model.addAttribute("login", "Login");
        return "login";
    }
}
