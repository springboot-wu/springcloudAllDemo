package com.example.product02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {


    @GetMapping("/getProductmsg")
    public String msg(){

        return "this is product02 msg";
    }
}
