package com.jumshudivanych.masterforyourhome.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestTechnologyController {


    @GetMapping("/test-technology")
    public String viewTestPage() {
        return "test-technology";
    }
}
