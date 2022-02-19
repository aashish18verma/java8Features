package com.company.interfaceEnhancement.Predicate;

import java.util.function.Predicate;

public class PredicateExampleIsEqual {
    public static void main(String[] args) {
        String Name = "Jai kishan";

        Predicate<String> nameEquals = Predicate.isEqual("Jai kishan");


        System.out.println(nameEquals.test(Name));
    }
}
