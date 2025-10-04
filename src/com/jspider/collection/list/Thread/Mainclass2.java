package com.jspider.collection.list.Thread;

public class Mainclass2 {

    public static void main(String[] args) {
        System.out.println("main method starts..");
        Runnable r1= ()->{
            System.out.println("task 1 starts...");
            for (int j=4;j>=1;j--){
                System.out.println(j);
            }
            System.out.println("Task 1 ends....");
        };
        Runnable r2=()->{
            System.out.println("task 2 starts");
            for (int j=1;j<=5;j++){
                System.out.println(j);
            }
            System.out.println("task 2 ends...");
        };

        Thread t1=new Thread(r1);
        t1.start();


        Thread t2=new Thread(r2);
        t2.start();

        System.out.println("main methods ends..");
    }

}
