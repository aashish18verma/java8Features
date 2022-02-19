package com.company.interfaceEnhancement.doubleColonOpertor;

public class OneMain {
    public static void main(String[] args) {
       /* LambdaOne lambdaOne = () -> System.out.println("this is from lambda one");
        lambdaOne.show();

        Employee employee = new Employee();
        LambdaOne lambdaOne1 = employee::details;
        lambdaOne.show();
        Lambda2 lambda2 = employee::details1;
        lambda2.show2(5);*/

        Lambda2 lambda2static = Employee::detailsStatic;
        lambda2static.show2(2);
    }
}
