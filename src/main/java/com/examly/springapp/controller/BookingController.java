package com.examly.springapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookingController {
    @PostMapping("/bookings")
    public void create(){
        //Create function
    }

    @GetMapping("/bookings")
    public void read(){
        //Read function
    }

    @GetMapping("/bookings/{bookingId}")
    public void getById(@PathVariable int bookingId){
        //GetById function
    }
}
