package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    public BasketballCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Do 15 suicides!";
    }
}
