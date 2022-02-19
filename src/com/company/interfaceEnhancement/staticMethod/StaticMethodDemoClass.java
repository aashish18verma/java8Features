package com.company.interfaceEnhancement.staticMethod;

public class StaticMethodDemoClass implements StaticMethodDemo{

    public static void show(){// static method dont get available in implementing class
        System.out.println("I am java 8  static method of class  ");
    }
    public static void main(String[] args) {
        StaticMethodDemoClass obj  = new StaticMethodDemoClass();
        // static method is not available by object
        StaticMethodDemo.show();
        // but available by demo name
        StaticMethodDemoClass.show();
    }

}
