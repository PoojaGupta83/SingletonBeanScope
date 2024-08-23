package com.scope.example.singleton.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*creating bean*/
@Component
@Scope("singleton")
public class User {
    public User(){
        System.out.println("User initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("User Object HashCode"+this.hashCode());
    }
}
