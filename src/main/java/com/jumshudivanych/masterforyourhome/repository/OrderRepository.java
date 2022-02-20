package com.jumshudivanych.masterforyourhome.repository;

import com.jumshudivanych.masterforyourhome.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByName(String name);

}
