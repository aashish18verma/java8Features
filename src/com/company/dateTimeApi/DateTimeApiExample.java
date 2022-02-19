package com.company.dateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeApiExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        //date time and year
        System.out.println(date.getYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getMonth());

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //time, sec min
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);


        LocalDateTime futureDate = LocalDateTime.of(2023,3,23,8,30,23);
        System.out.println(futureDate);
    }
}


