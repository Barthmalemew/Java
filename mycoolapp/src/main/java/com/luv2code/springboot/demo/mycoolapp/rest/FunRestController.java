package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //Handle HTTP GET requests
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}