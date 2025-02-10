package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    // Endpoint for addition
    @GetMapping("/add")
    public Long add(@RequestParam Long a, @RequestParam Long b) {
    	System.out.println(" Running addPost()"+ a +" + "+b );
        return a + b;
    }
    @PostMapping("/add-post")
    public Long addPost(@RequestParam Long a, @RequestParam Long b) {
        return a + b;
    }

    // Endpoint for subtraction
    @GetMapping("/sub")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    // Endpoint for multiplication
    @GetMapping("/mul")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }
}
