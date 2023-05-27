package com.academy.controller;

import com.academy.dto.UserDto;
import com.academy.mapper.UserMapper;
import com.academy.model.entity.Role;
import com.academy.model.entity.User;
import com.academy.model.repository.UserRepository;
import com.academy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class RegistrationController {
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        if (!userForm.getPassword().equals(userForm.getPassword())){
            model.addAttribute("passwordError", "Пароли не совпадают");
            return "registration";
        }
//        if (!userService.registerNewUserAccount(.getUsername())){
//            model.addAttribute("usernameError", "Пользователь с таким именем уже существует");
//            return "registration";
//        }

        return "redirect:/";
    }
}



















//    @GetMapping("/registration")
//    public String registration(Model model) {
//        model.addAttribute("registration", "Registration");
//        return "registration";
//    }
//}
//    @GetMapping("/registration")
//    public String addUser( @RequestParam (value = "username") String username, @RequestParam (value = "password") String password, Model model) {
////model.addAttribute("username", username);
//        model.addAttribute("password", password);

//        User userFormDb=userRepository.findByUsername(user.getUsername());
//
//
//        if (userFormDb!=null) {
//            model.put("massage","User exist!");
//            return "registration";
//        }
////
//        user.setRoles(Collections.singletonList(Role.ROLE_USER));
    //    User user = userService.registerNewUserAccount(userDto);
//userRepository.save(user);
//        return "redirect:/*";
//    }
//}
//    @PostMapping(value = "/registration")
//    public String registrationForm(WebRequest request, Model model) {
//        UserDto userDto = new UserDto();
//        model.addAttribute("user", userDto);
//        return "registration";

