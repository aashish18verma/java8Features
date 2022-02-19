package com.company.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExtras {
    public static void main(String[] args) {
        int[] a = {2,4,5,6,7};

        IntStream is = Arrays.stream(a); //for primitive
        Stream s1 = Stream.of(a);
        Stream s2 = Stream.of(2,33,45,76,87,87);
        Stream s3 = Stream.of(33,55,11,67,87);
        Stream s4 = Stream.concat(s2,s3).distinct();
        s4.forEach(System.out::println);
        IntStream stream2_10 = IntStream.range(2,11);
        stream2_10.forEach(value -> {
            System.out.print(" "+value);
        });

    }
}
