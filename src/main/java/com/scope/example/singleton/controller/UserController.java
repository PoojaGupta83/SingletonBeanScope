package com.scope.example.singleton.controller;

import com.scope.example.singleton.entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    User user;

    public UserController(){
        System.out.println("User Controller initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("User controller hashCode"+this.hashCode()+"User hashCode"+user.hashCode());
    }

    @GetMapping(value = "/fetchUser1")
    public ResponseEntity<String>getUserDetails(){
        System.out.println("fetch User Api");
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }
}
