package com.academy.controller;

import com.academy.dto.UserDto;
import com.academy.mapper.UserMapper;
import com.academy.model.entity.User;
import com.academy.model.repository.UserRepository;
import com.academy.service.UserService;
import com.academy.util.UserValidator;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Data
public class RegistrationController {

    private final UserRepository userRepository;

    private final UserService userService;

    private final UserMapper userMapper;

    private final UserValidator userValidator;

    @GetMapping("/registration")
    public String registrationPage(@ModelAttribute("user") UserDto userDto) {

        return "/registration";
    }

    @PostMapping("/registration")
    public String performRegistration(@ModelAttribute("user") @Validated UserDto userDto,
                                      BindingResult bindingResult,
                                      Model model) {
        User user = userMapper.toEntity(userDto);
        userValidator.validate(user, bindingResult);

        if (bindingResult.hasErrors()) {
            model.addAttribute("usernameError1", "Enter the user name or password");
            return "registration";
        }

        User userDb = new User();
        userDb.setUsername(userDto.getUsername());

        if (!userService.saveUser(userDb)) {
            model.addAttribute("usernameError", "A user with this name already exists");
            return "registration";
        }

        userService.save(userDto);
        return "redirect:/";
    }
}
