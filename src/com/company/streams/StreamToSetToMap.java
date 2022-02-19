package com.company.streams;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class StreamToSetToMap {
    public static void main(String[] args) {
        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(3);
        numSet.add(4);
        numSet.add(7);
        numSet.add(9);

        Set<Integer> filterSet =  numSet.stream().filter(a->a>3).collect(Collectors.toSet());
        System.out.println(filterSet);
        Map<Integer,Integer> newMap = numSet.stream().collect(toMap( x-> x, y -> y*100));
        System.out.println(newMap);
    }
}
