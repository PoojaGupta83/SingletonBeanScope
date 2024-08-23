package com.scope.example.singleton.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    public Employee(){
        System.out.println("Employee Initialized");
    }
    @PostConstruct
    public void init(){
        System.out.println("Employee Object HashCode"+this.hashCode());
    }

}
