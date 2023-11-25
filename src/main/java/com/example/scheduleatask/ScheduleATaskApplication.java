package com.example.scheduleatask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScheduleATaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduleATaskApplication.class, args);
    }

}
