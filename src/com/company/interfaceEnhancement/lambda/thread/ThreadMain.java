package com.company.interfaceEnhancement.lambda.thread;

public class ThreadMain {
    public static void main(String[] args) {
        //Runnable runnable = new CodeToRunAsSeparateThread();

        Runnable runnable = () ->{
            for(int i=0;i<=5;i++)
            {
                System.out.println("child thread counter value is "+i);
            }
        };
        for(int i=0;i<=5;i++)
        {
            System.out.println("child thread counter value is "+i);
        }
        Thread thread = new Thread(runnable);
        thread.start();

        for(int i=0;i<5;i++){
            System.out.println("main thread counter value"+i);
        }
    }
}
