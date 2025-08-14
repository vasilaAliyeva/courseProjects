package com.xcompany.mavenproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/oca42")
    public String helloApi() {
        return "Hello, World from REST!";
    }
}