package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {
       @PostMapping("/paymentss")
    public void create(){
        //Create function
    }

    @GetMapping("/payments")
    public void read(){
        //Read function
    }

    @GetMapping("/payments/{paymentId}")
    public void getById(@PathVariable int paymentId){
        //GetById function
    } 
}
