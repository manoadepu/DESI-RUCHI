package com.desiruchi.service_one.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SellerController {

    @RequestMapping("/testingRest")
    public void testingRest(){
        System.out.println("Working");
    }
}
