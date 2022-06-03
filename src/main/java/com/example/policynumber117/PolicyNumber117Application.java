package com.example.policynumber117;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PolicyNumber117Application {
    public static void main(String[] args) {
        SpringApplication.run(PolicyNumber117Application.class, args);
    }
@Autowired
    Services srv;

    @GetMapping("/Policy")
    public String sayPolicy(@RequestParam(value = "myName", defaultValue = "test")String name) {
        return "You have comprehensive policy";
    }
    @GetMapping("/getQ")
    public String getQ(@RequestParam(value = "myName", defaultValue = "test")String name) {


         return srv.ServiceMethod();
    }
    @GetMapping("/Username")
    public String sayUsername(@RequestParam(value = "myName", defaultValue = "test")String name) {
        return "Please Type Your Username";
    }
    @GetMapping("/Password")
    public String sayPassword(@RequestParam(value = "myName", defaultValue = "test")String name) {
        return "Please Type correct Password";
    }
}
