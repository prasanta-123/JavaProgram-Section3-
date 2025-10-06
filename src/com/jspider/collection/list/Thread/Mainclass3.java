package com.jspider.collection.list.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass3 {
    public static void main(String[] args) {
        System.out.println("MAIN STARTS");

        Runnable task1= ()->{
            for (int i=1;i<=4;i++){
                System.out.println("Running task1");
            }
        };
        ExecutorService es1= Executors.newSingleThreadExecutor();
        es1.submit(task1);
        es1.shutdown();


        System.out.println("MAIN ENDS");
    }
}
