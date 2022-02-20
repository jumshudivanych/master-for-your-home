package com.jumshudivanych.masterforyourhome.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").authenticated()
                //.antMatchers(HttpMethod.GET, "/admin/all").hasRole("ADMIN")
                //.antMatchers(HttpMethod.POST, "/admin/**").hasRole("ADMIN")
                .antMatchers("/messages/**").authenticated()
                .antMatchers("/messages/all").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .usernameParameter("login")
                .defaultSuccessUrl("/admin")
                .permitAll()
                .and()
                .logout().logoutSuccessUrl("/").permitAll()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }

    @Bean
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("admin1")
                        .password("xMsGL2$YznEC")
                        .roles("ADMIN")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
}
