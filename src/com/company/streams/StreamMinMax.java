package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(33,56,1,555,66,97,12);
        Integer minNum = numbers.stream().min(StreamMinMax::sortElements).get();
        System.out.println(minNum);
        Integer maxNum = numbers.stream().max(StreamMinMax::sortElements).get();
        System.out.println(maxNum);

        List<Integer> dupNumbers = Arrays.asList(33,56,1,555,66,97,12,33,56,1,555,66,97,12);

        List<Integer> dupSortedList = dupNumbers.stream().sorted().collect(Collectors.toList());
        System.out.println(dupSortedList);
        List<Integer> DistinctSortedList = dupSortedList.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(DistinctSortedList);
    }
    public static  Integer sortElements(Integer a, Integer b ){
        return a.compareTo(b);
    }
}
