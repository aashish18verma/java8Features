package com.company.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(11,22,33,44,55,66);
        System.out.println("numList"+numList);

        List<Integer> newNUmList = numList.stream().map(x->x).collect(Collectors.toList());
        System.out.println(newNUmList);

        List newNUmList3 = numList.stream().map(x->Arrays.asList(x,x+1)).collect(Collectors.toList());
        System.out.println(newNUmList3);

        List numList4 = numList.stream().flatMap(x-> Stream.of(x,x+1)).collect(Collectors.toList());

        //flttering of list

        System.out.println(numList4);
    }

}
