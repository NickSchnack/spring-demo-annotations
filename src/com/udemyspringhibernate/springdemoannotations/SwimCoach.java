package com.udemyspringhibernate.springdemoannotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements iCoach {

    private iFortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public SwimCoach() {}

    public SwimCoach(iFortuneService someFortuneService) {
        this.fortuneService = someFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for 20 minutes using the breaststroke technique.";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortune();
    }

    public String getEmail() {
        return this.email;
    }

    public String getTeam() {
        return this.team;
    }

}

