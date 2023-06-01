package com.academy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping(value = "/")
    public String homePage(Model model) {
        model.addAttribute("home", "Car Sharing");
        return "index";
    }

    @GetMapping(value = "/main_page")
    public String mainPage(Model model) {
        model.addAttribute("main", "Car Sharing");
        return "main_page";
    }
}
