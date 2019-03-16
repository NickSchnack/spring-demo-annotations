package com.udemyspringhibernate.springdemoannotations;

import org.springframework.stereotype.Component;
import java.util.Random;

@Component
public class RandomFortuneService implements iFortuneService {

    private Random random = new Random();
    private String[] fortuneData = {
            "Today is your lucky day!",
            "Something great is about to happen!",
            "You will learn something awesome this week!"
    };

    @Override
    public String getFortune() {
        return getRandomFortune();
    }

    private String getRandomFortune() {
        int index = random.nextInt(fortuneData.length);
        return fortuneData[index];
    }

}

