package com.jspider.collection.list.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import  java.util.concurrent.TimeUnit;

public class Mainclass6 {
    public static void main(String[] args) {
        System.out.println("MAIN STARTS..");
        int core = Runtime.getRuntime().availableProcessors();
        System.out.println(core);
        ScheduledExecutorService es1 = Executors.newScheduledThreadPool(core);
        Runnable task1 = () -> {
            System.out.println("runing 1");
        };
         // es1.scheduleAtFixedRate(task1,0,3,TimeUnit.SECONDS);
          es1.scheduleWithFixedDelay(task1,0,2,TimeUnit.SECONDS);
        System.out.println("Main ends");
        }

}