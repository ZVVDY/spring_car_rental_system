package com.academy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PersonDataController {
    @GetMapping(value = "/person_data")
    public String registrationPage(Model model) {
        model.addAttribute("person_data", "Person_Data");
        return "person_data";
    }
}
