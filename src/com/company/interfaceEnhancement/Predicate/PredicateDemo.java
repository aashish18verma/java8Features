package com.company.interfaceEnhancement.Predicate;

public class PredicateDemo implements Predicate<Integer>{
    @Override
    public boolean test(Integer age) {
        if (age > 18) {
           return true;
        }
        return false;
    }
}
