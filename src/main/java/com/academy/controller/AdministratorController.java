package com.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdministratorController {
    @GetMapping(value = "/admin_page")
    public String orderPage(Model model) {
        model.addAttribute("admin_page", "Admin Page Sharing Car");
        return "admin_page";
    }
}
