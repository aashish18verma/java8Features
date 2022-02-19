package com.company.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
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

        List<Integer> tripleList = numbers.stream().map(num -> num*3).collect(Collectors.toList());
        System.out.println(tripleList);
    }
}
