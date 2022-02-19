package com.company.interfaceEnhancement.Predicate;

import java.util.function.Predicate;

public class PredicateExamples {
    public static void main(String[] args) {
        Integer[] numbers = {2, 6, 9, 8, 22, 29};
        Predicate<Integer> isOdd = num -> num % 2 != 0;
        /*for (Integer num:numbers) {
            if(isOdd.test(num)){
                System.out.println("odd number is "+num);
            }else {
                System.out.println("even number is "+ num);
            }
        }*/
        Predicate<Integer> gt10 = num -> num > 10;
        for (Integer num : numbers) {
            if (gt10.and(isOdd).test(num)) {
                System.out.println("greater than 10 odd number are " + num);
            }
        }
    }
}

