package com.example.start_springboot_maven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/index")
    public String sayHello() {
        return "Hello,Springboot!";
    }
}
