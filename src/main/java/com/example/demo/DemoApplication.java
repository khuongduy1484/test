package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static java.util.concurrent.TimeUnit.DAYS;

@SpringBootApplication
@EnableScheduling
public class DemoApplication {

    public static void main(String[] args) {

     Calendar start =  Calendar.getInstance();
     Date st = start.getTime();
        LocalDate localDate = st.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
     start.add(Calendar.MONTH,20);
     Date end = start.getTime();
     LocalDate localDate1 = end.toInstant()
             .atZone(ZoneId.systemDefault())
             .toLocalDate();
        long noOfMonths = ChronoUnit.MONTHS.between(localDate, localDate1) ;
        System.out.println(noOfMonths);





        SpringApplication.run(DemoApplication.class, args);
    }



}
