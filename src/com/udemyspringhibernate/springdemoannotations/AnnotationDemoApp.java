package com.udemyspringhibernate.springdemoannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // Read in Spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(VolleyConfig.class);

        // Get a bean
        iCoach coach = context.getBean("volleyballCoach", iCoach.class);

        // Use the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getFortune());

        // Close context
        context.close();
    }
}

