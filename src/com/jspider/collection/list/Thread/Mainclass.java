package com.jspider.collection.list.Thread;

class Demo extends Thread{
    @Override
    public void run(){
        System.out.println("run() of Demo starts...");
        for (int j=1;j<=5;j++){
            System.out.println(j);
        }

        System.out.println("run() of demo ends....");
    }

}
class Sample extends Object implements Runnable{

    @Override
    public void run(){
        System.out.println("run () of Sample starts...");
        for(int j=4;j>=1;j--){
            System.out.println(j);

        }
        System.out.println("run() of Sample class ends...");

    }
}



public class Mainclass {
    public static void main(String[] args) {
        System.out.println("Main method starts...");
        Demo d1=new Demo();
        d1.start();
        Sample s1=new Sample();
        Thread t1=new Thread(s1);
        t1.start();
        System.out.println("main method ends...");


    }
}
