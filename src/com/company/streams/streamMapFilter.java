package com.company.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class streamMapFilter {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList();
        fruits.add("kiwi");
        fruits.add("papaya");
        fruits.add("grapes");
        fruits.add("mango");

        //print the frits whose length is greater than 5
        System.out.println(fruits.stream().map(f->f.length()).collect(Collectors.toList()));
        System.out.println(fruits.stream().filter(f->f.length()>5).collect(Collectors.toList()));
        System.out.println(fruits.stream().filter(f->f.length()>5).collect(Collectors.toList()));


        System.out.println(fruits.stream().filter(f->f.length()>5).count());
    }
}
