package com.company.interfaceEnhancement.defaultMethod;

public interface VehicleJava8 {
    default void details(){
        System.out.println("i am java 8 default method by default available to implementing classes" +
                " and don't need to be implement in implementing classes");
    }
}

