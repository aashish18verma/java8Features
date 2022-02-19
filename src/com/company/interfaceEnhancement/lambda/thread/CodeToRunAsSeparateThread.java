package com.company.interfaceEnhancement.lambda.thread;

import javax.xml.bind.SchemaOutputResolver;

public class CodeToRunAsSeparateThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=5;i++)
        {
            System.out.println("child thread counter value is "+i);
        }
    }
}
