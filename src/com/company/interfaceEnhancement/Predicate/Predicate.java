package com.company.interfaceEnhancement.Predicate;

@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T t);
}
