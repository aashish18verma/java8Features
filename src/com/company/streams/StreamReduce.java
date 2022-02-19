package com.company.streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
       OptionalInt sum = IntStream.range(1,10).reduce((a, b)-> a+b);
        System.out.println(sum);
    }
}
