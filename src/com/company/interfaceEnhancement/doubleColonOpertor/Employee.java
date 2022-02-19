package com.company.interfaceEnhancement.doubleColonOpertor;

public class Employee {

    Employee(){
        System.out.println("default constructor");
    }
    public void details (){
        System.out.println("employee details one");
    }

    public  void details1(int num){
        System.out.println("employee details with one parameter "+num  );
    }

    public  static void detailsStatic(int num){
        System.out.println("employee details with one parameter static "+num  );
    }
}
