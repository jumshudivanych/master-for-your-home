package com.jumshudivanych.masterforyourhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String viewHomePage(Model model) {

        String sity = "Липецк";
        model.addAttribute("sity", sity);
        return "home";
    }

    @GetMapping("/fix-form")
    public String viewFixFormPage() {
        return "fix-form";
    }

    @GetMapping("/all-services")
    public String viewAllServices() {
        return "all-services";
    }
}
