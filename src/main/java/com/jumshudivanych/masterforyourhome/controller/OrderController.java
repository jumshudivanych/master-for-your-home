package com.jumshudivanych.masterforyourhome.controller;

import com.jumshudivanych.masterforyourhome.entity.Category;
import com.jumshudivanych.masterforyourhome.entity.Order;
import com.jumshudivanych.masterforyourhome.entity.Status;
import com.jumshudivanych.masterforyourhome.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/order/all-categories/getOrderForm")
    public String viewAllForm() {
        return "all-categories-form";
    }

    @GetMapping("/order/fix/getOrderForm")
    public String viewFixForm() {
        return "fix-form";
    }

    @GetMapping("/order/santech/getOrderForm")
    public String viewSantechForm() {
        return "santech-form";
    }

    @GetMapping("/order/electric/getOrderForm")
    public String viewElectricForm() {
        return "electric-form";
    }

    // Create new order fix
    @PostMapping("/order/fix/new")
    public String createNewFixOrder(@RequestParam(name="name", required=false) String name,
                                    @RequestParam(name="address", required=false) String address,
                                    @RequestParam(name="tel", required=false) String tel,
                                    @RequestParam(name="initMessage", required=false) String initMessage,
                                    Order order,
                                    Model model) {

        // создание корзины заказа и получение id
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);

        /*
        Basket basket = new Basket(date);
        //basket.setStatuses(Collections.singleton(Status.NEW));
        Long basketId = basket.getId();
        basketRepository.save(basket);
        */
        order.setName(name);
        order.setAddress(address);
        order.setTel(tel);
        order.setInitMessage(initMessage);
        //message.setAuthor(userPrincipal.getUsername());

        order.setCategories(Collections.singleton(Category.РЕМОНТ));
        order.setStatuses(Collections.singleton(Status.NEW));

        order.setCreateTime(date);

        orderRepository.save(order);

        //List<Message> listMessages = messageRepo.findAll();
        //model.addAttribute("listMessages", listMessages);

        return "success";

    }

    // Create new order electric
    @PostMapping("/order/electric/new")
    public String createNewElectricOrder(@RequestParam(name="name", required=false) String name,
                                    @RequestParam(name="address", required=false) String address,
                                    @RequestParam(name="tel", required=false) String tel,
                                    @RequestParam(name="initMessage", required=false) String initMessage,
                                    Order order,
                                    Model model) {

        // создание корзины заказа и получение id
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);

        /*
        Basket basket = new Basket(date);
        //basket.setStatuses(Collections.singleton(Status.NEW));
        Long basketId = basket.getId();
        basketRepository.save(basket);
        */
        order.setName(name);
        order.setAddress(address);
        order.setTel(tel);
        order.setInitMessage(initMessage);
        //message.setAuthor(userPrincipal.getUsername());

        order.setCategories(Collections.singleton(Category.ЭЛЕКТРИКА));
        order.setStatuses(Collections.singleton(Status.NEW));

        order.setCreateTime(date);

        orderRepository.save(order);

        //List<Message> listMessages = messageRepo.findAll();
        //model.addAttribute("listMessages", listMessages);

        return "success";

    }

    // Create new order santech
    @PostMapping("/order/santech/new")
    public String createNewSantechOrder(@RequestParam(name="name", required=false) String name,
                                    @RequestParam(name="address", required=false) String address,
                                    @RequestParam(name="tel", required=false) String tel,
                                    @RequestParam(name="initMessage", required=false) String initMessage,
                                    Order order,
                                    Model model) {

        // создание корзины заказа и получение id
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd ' ' HH:mm:ss zzz");
        String date = formatForDateNow.format(dateNow);

        /*
        Basket basket = new Basket(date);
        //basket.setStatuses(Collections.singleton(Status.NEW));
        Long basketId = basket.getId();
        basketRepository.save(basket);
        */
        order.setName(name);
        order.setAddress(address);
        order.setTel(tel);
        order.setInitMessage(initMessage);
        //message.setAuthor(userPrincipal.getUsername());

        order.setCategories(Collections.singleton(Category.САНТЕХНИКА));
        order.setStatuses(Collections.singleton(Status.NEW));

        order.setCreateTime(date);

        orderRepository.save(order);

        //List<Message> listMessages = messageRepo.findAll();
        //model.addAttribute("listMessages", listMessages);

        return "success";

    }


}
