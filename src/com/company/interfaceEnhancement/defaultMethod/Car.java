package com.company.interfaceEnhancement.defaultMethod;

public class Car implements VehicleJava8 {
    //note default method is available  to implementing class and its not necessary to implement
    public static  void main (String args[]){
        Car car = new Car();
        car.details();
    }
}
