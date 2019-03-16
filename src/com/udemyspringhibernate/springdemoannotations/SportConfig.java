package com.udemyspringhibernate.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("com/udemyspringhibernate/springdemoannotations/sport.properties")
public class SportConfig {

    @Bean
    public MyLoggerConfig myLoggerConfig() {
        MyLoggerConfig newLoggerConfig = new MyLoggerConfig();
        newLoggerConfig.setRootLoggerLevel("FINE");
        newLoggerConfig.setPrintedLoggerLevel("FINE");
        return newLoggerConfig;
    }

    @Bean
    public iFortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public iCoach swimCoach() {
        return new SwimCoach(happyFortuneService());
    }

}

