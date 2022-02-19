package com.company.interfaceEnhancement.functionalInterface;

@FunctionalInterface
public interface InterfaceJava8 {

    void show2();
    // void show();
    // single abstract method is allowed
    static void  staticMethod1(){
        System.out.println("any number of static method allowed in functional interface");
    }
    static void  staticMethod2(){
        System.out.println("any number of static method allowed in functional interface");
    }

    default void DefaultMethod1(){
        System.out.println("ant number of default methods are allowed");
    }
    default void DefaultMethod2(){
        System.out.println("ant number of default methods are allowed");
    }
}
