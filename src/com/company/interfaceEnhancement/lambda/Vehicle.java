package com.company.interfaceEnhancement.lambda;

@FunctionalInterface
public interface Vehicle {
    void details();
    default void getMileage(){
        System.out.println("showing mileage details");
    }
}
