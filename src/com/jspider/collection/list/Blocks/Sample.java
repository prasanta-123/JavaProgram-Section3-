package com.jspider.collection.list.Blocks;
//STATIC BLOCKS PROGRAM..
public class Sample {

     static int a=5;
     static {
         System.out.println("this is the first static block");
     }
     public static void m1(){
         System.out.println("this is  m1() of Sample class..");
     }
     static {
         System.out.println("this is the second static block");
     }
     static {
         System.out.println("This is the Third Static block...");
     }

    }
    class Exp{
        public static void main(String[] args) {
            System.out.println(Sample.a);


        }
    }