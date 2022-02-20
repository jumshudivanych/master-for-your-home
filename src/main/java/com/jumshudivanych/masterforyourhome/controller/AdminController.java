package com.jumshudivanych.masterforyourhome.controller;

import com.jumshudivanych.masterforyourhome.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/admin/orders/all")
    public String showMessages(Model model) {

        model.addAttribute("listOrders", orderRepository.findAll());

        return "admin";
    }

    @PostMapping("/admin/orders/delete")
    public String deleteOrder(@RequestParam Long id) {

        orderRepository.deleteById(id);
        return "redirect:/admin/orders/all";
    }

}
