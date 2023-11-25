package com.example.scheduleatask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyScheduleService {

    // This method will be scheduled to run periodically
    @Scheduled(cron = "*/5 * * * * *") // 5 seconds
    public void scheduledMethod() {
        // Code to be executed periodically
        System.out.println("Scheduled task executed at " + new Date());
    }
}

