package com.academy.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@RequiredArgsConstructor
public class ContactController {
    @GetMapping(value = "/contact")
    public String contactPage(Model model) {
        model.addAttribute("contact", "Contact");
        return "contact";
    }
}
