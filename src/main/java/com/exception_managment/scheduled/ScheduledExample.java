package com.exception_managment.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {
    @Scheduled(cron = "0 */1 * * * *")
    public void numberPrint(){
        for (int i=0; i<10; i++){
            System.out.printf("%d ", i);
        }
    }
}
