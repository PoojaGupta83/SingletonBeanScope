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
public class EmployeeController {
    @Autowired
    User user;

    public EmployeeController(){
        System.out.println("EmployeeController Init");
    }

    @PostConstruct
    public void init(){
        System.out.println("Employee Control ler HashCode:"+this.hashCode()+"User HashCode"+user.hashCode());
    }
    @GetMapping(value = "/fetchUser")
    public ResponseEntity<String> getUserDetails(){
        System.out.println("fetch User Api");
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }
}
