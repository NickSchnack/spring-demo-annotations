package com.udemyspringhibernate.springdemoannotations;

public class SadFortuneService implements iFortuneService{

    @Override
    public String getFortune() {
        return "Today is a sad day...";
    }

}
