package com.company.dateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimeExample3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate startDate = LocalDate.of(2018,4,26);

        Period period = Period.between(startDate,today);

        System.out.println(" Total Years of experience is "+period.getYears()+ " years "+period.getMonths()+" months and "+period.getDays()+ " days");

    }
}
