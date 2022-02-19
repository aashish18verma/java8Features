package com.company.interfaceEnhancement.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate predicate = new PredicateDemo();
        boolean result = predicate.test(20);
        System.out.println(result);
    }
}
