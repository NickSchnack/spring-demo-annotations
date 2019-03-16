package com.udemyspringhibernate.springdemoannotations;

public class VolleyballCoach implements iCoach {

    private iFortuneService fortuneService;

    public VolleyballCoach (iFortuneService newFortuneService) {
        this.fortuneService = newFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice serves for 5 minutes and spikes for 10 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }

}
