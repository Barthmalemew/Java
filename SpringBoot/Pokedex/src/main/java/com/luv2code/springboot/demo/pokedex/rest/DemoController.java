package com.luv2code.springboot.demo.pokedex.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String getPokedex(){
        return "Pikachu mother fucker!.";

    }
}
