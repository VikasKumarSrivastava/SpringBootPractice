package com.nt.example.demo.config;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.example.demo.beans")
public class AppConfig {

    public AppConfig() {
        System.out.println("AppConfig.AppConfig()");
    }

    @Bean(name ="dt")
    public LocalDateTime createDateTime(){
        System.out.println("createDateTime is called");
        return LocalDateTime.now();
    }
    @Bean(name ="ld")
    public LocalDate createDate(){
        System.out.println("createDate is called");
        return LocalDate.now();
    }
}
