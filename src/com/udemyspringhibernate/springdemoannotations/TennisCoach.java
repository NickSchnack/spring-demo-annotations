package com.udemyspringhibernate.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements iCoach {

    @Autowired
    @Qualifier("randomFortuneService")
    private iFortuneService fortuneService;

    public TennisCoach() {
        //System.out.println("Inside constructor for the TennisCoach class");
    }


    @PostConstruct
    public void doSomeSetup() {
        //System.out.println("Inside 'doSomeSetup' method of the TennisCoach class");
    }

    @PreDestroy
    public void doSomeCleanup() {
        //System.out.println("Inside 'doSomeCleanup' method of the TennisCoach class");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortune();
    }
}

