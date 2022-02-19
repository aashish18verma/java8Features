package com.company.interfaceEnhancement.lambda;


public class VehicleLambdaMain {
    public static void main(String[] args) {
        Vehicle vehicle = ()->{
            System.out.println("Vehicle details from lambda");
        };
        vehicle.details();

        Calculator calculator = a-> a+a;
        System.out.println(calculator.add(2));


        //1 remove modifier then return type then method name
        //2 add -> arrow operator
        MultiplyInterface multiplyInterface = () -> System.out.println("i am a lambda funcation");
        multiplyInterface.multiply();

     }
}
