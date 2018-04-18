package com.desiruchi.service_one.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ItemController {

    @GetMapping
    public String create(){
        return "mapped!";
    }
}
