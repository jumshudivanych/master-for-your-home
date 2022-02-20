package com.jumshudivanych.masterforyourhome.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="orders")
public class Order {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    // Переделать
    private String address;

    private String tel;

    private String initMessage;


    @ElementCollection(targetClass = Status.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "order_status", joinColumns = @JoinColumn(name = "order_id"))
    @Enumerated(EnumType.STRING)
    private Set<Status> statuses;


    @ElementCollection(targetClass = Category.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "order_category", joinColumns = @JoinColumn(name = "category_id"))
    @Enumerated(EnumType.STRING)
    private Set<Category> categories;



    private String createTime; // Время создания

    //private String startWorkTime; // Время начала выполнения работ

    public Order() {

    }

    public Order(String name, String address, String tel, String initMessage) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.initMessage = initMessage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getInitMessage() {
        return initMessage;
    }

    public void setInitMessage(String initMessage) {
        this.initMessage = initMessage;
    }


    public Set<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(Set<Status> statuses) {
        this.statuses = statuses;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
