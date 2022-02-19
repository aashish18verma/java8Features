package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamColonOperator {
    public static void main(String[] args) {
        List<String> alphaNumeric = Arrays.asList("A11","A22","a23","a44","c89");

        System.out.println(alphaNumeric.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).collect(Collectors.toList()));
        //filter is a lazy operation coz untlit operation is performed on the filter only then it is executed

        alphaNumeric.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).collect(Collectors.toList()).forEach(a-> System.out.println(a));

        alphaNumeric.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);

    }
}
