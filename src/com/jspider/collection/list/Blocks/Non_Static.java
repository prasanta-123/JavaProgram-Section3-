package com.jspider.collection.list.Blocks;
//NON STATIC BLOCKS..
public class Non_Static {
    int a=30;
    {
        System.out.println("this is the first non-static block");
    }
    {
        System.out.println("This is the Second non-static block..");
    }
    public void m1(){
        System.out.println("this is m1() of non-static class");
    }
    {
        System.out.println("this is the Third non-static blocks..");
    }
}


class Demo{
    public static void main(String[] args) {
        Non_Static non=new Non_Static();
    }
}