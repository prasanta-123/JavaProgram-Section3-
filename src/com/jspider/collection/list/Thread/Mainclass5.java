package com.jspider.collection.list.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass5 {
    public static void main(String[] args) {
        System.out.println("MAIN STARTS..");
        int threds=Runtime.getRuntime().availableProcessors();
        System.out.println(threds);
        ExecutorService es1= Executors.newScheduledThreadPool(threds);
        Runnable task1=()->{
            System.out.println("runing 1");
        };
        for (int i=1;i<=5;i++){
            es1.submit(task1);
        }
        es1.shutdown();


        System.out.println(" MAIN ENDS ");
    }
}
