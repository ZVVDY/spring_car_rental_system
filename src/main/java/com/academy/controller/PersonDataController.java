package com.academy.controller;

import com.academy.dto.PersonDto;
import com.academy.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;

@Controller
@RequiredArgsConstructor
public class PersonDataController {

    private final PersonService personService;

    @GetMapping(value = "/person_data")
    public String personPage(@ModelAttribute("person") PersonDto personDto) {
        return "person_data";
    }

    @PostMapping("/person_data")
    public String formPersonDataPage(@ModelAttribute("person") PersonDto personDto) throws ParseException {
        personService.save(personDto);
        return "/person_data";
    }
}
