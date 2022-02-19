package com.company.streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        integerList.stream().forEach(System.out::println);
        System.out.println("***************************");
        integerList.stream().parallel().forEach(System.out::println);
        System.out.println("***************************");
        integerList.parallelStream().forEach(System.out::println);
    }
}
