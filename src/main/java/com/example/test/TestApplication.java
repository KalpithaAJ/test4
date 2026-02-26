package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @GetMapping("/add")
    public String addNumbers() {

        int a = 10;
        int b = 20;
        int sum = a + b;

        return "Sum is: " + sum;
    }
}
