package com.company.interfaceEnhancement.doubleColonOpertor;

public class TwoMain {
    public static void main(String[] args) {
        /* ConstReference constReference =()-> new Employee();
        constReference.getEmployee();*/

        ConstReference constReference = Employee::new;
        constReference.getEmployee();
    }
}
