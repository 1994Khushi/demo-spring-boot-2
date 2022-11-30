package com.example.demospringboot2.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculator {

    @RequestMapping("/add")
    public int add() {
        int a = 25;
        int b = 3;

        return a + b;
    }

    @RequestMapping("/subtraction")
    public int sub() {
        int a = 25;
        int b = 3;

        return a - b;
    }

    @RequestMapping("/multiply")
    public int multi() {
        int a = 25;
        int b = 3;

        return a * b;
    }

    @RequestMapping("/divide")
    public int divide() {
        int a = 25;
        int b = 3;

        return a / b;
    }
}