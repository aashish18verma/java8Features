package com.company.dateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeExample4 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("My current  time zone is "+zoneId);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDate date Time "+dateTime);

        ZoneId zoneIdOdLA = ZoneId.of("America/Los_Angeles");
       /* LocalDateTime localDateTimeLA = LocalDateTime.now(zoneIdOdLA);
        System.out.println("time of LA is "+localDateTimeLA);*/
        System.out.println("date time at LA "+ ZonedDateTime.now(zoneIdOdLA));

        ZoneId zoneIdGMT = ZoneId.of("GMT+05:30");
        System.out.println("time at GMT+05:30 "+ZonedDateTime.now(zoneIdGMT) );
    }
}
