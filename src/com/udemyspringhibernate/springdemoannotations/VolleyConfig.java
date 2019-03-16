package com.udemyspringhibernate.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VolleyConfig {

    @Bean
    public MyLoggerConfig myLoggerConfig() {
        MyLoggerConfig newLoggerConfig = new MyLoggerConfig();
        newLoggerConfig.setRootLoggerLevel("FINE");
        newLoggerConfig.setPrintedLoggerLevel("FINE");
        return newLoggerConfig;
    }

    @Bean
    public iFortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public iCoach volleyballCoach () {
        return new VolleyballCoach(sadFortuneService());
    }

}
