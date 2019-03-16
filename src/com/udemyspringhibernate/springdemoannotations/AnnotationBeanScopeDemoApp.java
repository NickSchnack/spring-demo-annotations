package com.udemyspringhibernate.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[]args) {

        // Read in Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/udemyspringhibernate/springdemoannotations/applicationContext.xml");

        // Get a bean
        iCoach coach = context.getBean("tennisCoach", iCoach.class);

        // Use the bean


        // Close context
        context.close();

    }
}
