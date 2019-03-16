package com.udemyspringhibernate.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements iFortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}

