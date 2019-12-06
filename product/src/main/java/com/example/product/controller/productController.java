package com.example.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myproduct")
public class productController {


    @GetMapping("/getProductmsg")
    public String msg(){

        return "this is product msg";
    }
}
