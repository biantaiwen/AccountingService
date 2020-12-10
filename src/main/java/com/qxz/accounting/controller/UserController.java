package com.qxz.accounting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1.0/users")
public class UserController {
    @GetMapping("/hello")
    public String hello () {
        return "hello";
    }
}
