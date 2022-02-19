package com.company.interfaceEnhancement.Predicate;

import java.util.ArrayList;

public class PredicateDemoMainJava8 {
    public static void main(String[] args) {
       // Predicate<Integer> result = (Integer age) -> {return  age>18; };

        Predicate<Integer> result = age -> age>18;

        System.out.println(result.test(20));


        ArrayList<String> al = new ArrayList<>();
        Predicate<ArrayList> predicate = arrayList -> al.isEmpty();
        System.out.println(predicate.test(al));
        al.add("hello");
        System.out.println(predicate.test(al));
    }


}
