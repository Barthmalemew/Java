package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

    public SoccerCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Run the track for 5 miles!";
    }
}
