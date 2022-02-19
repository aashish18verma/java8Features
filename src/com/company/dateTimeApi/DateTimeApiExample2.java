package com.company.dateTimeApi;

import java.time.LocalDateTime;

public class DateTimeApiExample2 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("after 22 days "+dateTime.plusDays(22));
        System.out.println("after 2 months "+dateTime.plusMonths(2));
        System.out.println("after 2 years "+ dateTime.plusYears(2));
        System.out.println("before 2 hours "+ dateTime.minusHours(2));

    }
}
