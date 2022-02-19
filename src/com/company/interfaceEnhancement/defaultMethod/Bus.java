package com.company.interfaceEnhancement.defaultMethod;

public class Bus implements VehicleJava7 {

    @Override
    public void details() {
        System.out.println("here  in java 7 non default method  needs to implemented that is necessary");
    }

    public static void show(){
        Bus b = new Bus();
        b.details();
    }

    public static void main(String[] args) {
      Bus.show();
    }

}
