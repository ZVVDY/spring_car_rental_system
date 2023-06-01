package com.academy.controller;

import com.academy.dto.OrderDto;
import com.academy.mapper.OrderMapper;
import com.academy.model.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@Data
public class AdministratorController {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @GetMapping(value = "/admin_page")
    public String orderPage(Model model) {
        model.addAttribute("admin_page", "Admin Page Sharing Car");
        return "admin_page";
    }

    @GetMapping(value = "/order_admin")
    public String adminOrderPage(Model model) {
        List<OrderDto> dtoList = orderMapper.modelsToDto(orderRepository.findAll());
        model.addAttribute("order", "Admin Page Sharing Car");
        return "order_admin";
    }
}
