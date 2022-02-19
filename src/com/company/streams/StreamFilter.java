package com.company.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println(numbers); //[1, 2, 3, 4, 5, 6, 7]

        //BEFORE JAVA 8
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (Integer i : numbers)
        {
            if(i%2 != 0){
                oddNumbers.add(i);
            }
        }
        System.out.println(oddNumbers);

        //AFTER JAVA 8 streams
        Predicate<Integer> evenPredicate = num-> num%2 == 0 ;
        List<Integer> evenNumbers = numbers.stream().filter(evenPredicate).collect(Collectors.toList());
       //List<Integer> evenNumbers = numbers.stream().filter(num-> num%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

    }
}
