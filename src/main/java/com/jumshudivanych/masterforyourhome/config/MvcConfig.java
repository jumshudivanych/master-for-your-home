package com.jumshudivanych.masterforyourhome.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    //@Value("${upload.path}")
    //private String uploadPath;

    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("home");

        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/test-technology").setViewName("test-technology");
        registry.addViewController("/react-template").setViewName("react-template");
        registry.addViewController("/fix-form").setViewName("fix-form");
        registry.addViewController("/electric-form").setViewName("electric-form");
        registry.addViewController("/santech-form").setViewName("santech-form");
        registry.addViewController("/success").setViewName("success");
        //registry.addViewController("/error").setViewName("error");

        registry.addViewController("/admin").setViewName("admin");


    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler(
                "/webjars/**",
                "/img/**",
                "/css/**",
                "/js/**")
                .addResourceLocations(
                        "classpath:/META-INF/resources/webjars/",
                        "classpath:/static/img/",
                        "classpath:/static/css/",
                        "classpath:/static/js/");
        //registry.addResourceHandler("/img/**")
        //       .addResourceLocations("file://" + uploadPath + "/");
        //registry.addResourceHandler("/static/**")
        //        .addResourceLocations("classpath:");
    }
}
