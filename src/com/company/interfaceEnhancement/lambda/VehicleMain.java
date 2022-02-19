package com.company.interfaceEnhancement.lambda;

public class VehicleMain {
    public static void main(String[] args) {
        VehicleImpl vehicle = new VehicleImpl();
        vehicle.details();

        Vehicle vehicle1 = new VehicleImpl();
        vehicle1.details();
    }
}
