package com.bootcamp.assignment4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunctionController {

    @GetMapping("/message")
    public String message() {
        return "Hello Bootcamp";
    }

    @GetMapping("/number")
    public Integer number() {
        return 100;
    }

    @GetMapping("/status")
    public Boolean status() {
        return true;
    }

    @GetMapping("/grade")
    public Character grade() {
        return 'A';
    }
}