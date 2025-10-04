package com.jspider.collection.list.Objectclass;
class Demo extends Object{
    @Override
    public  int hashCode(){
        int v1=100+50;
        return v1;
    }
    @Override
    public  String toString(){
        String s1="hello";
        return s1;
    }
     @Override
    public boolean equals(Object o ){
        return true;
     }
}
public class Mainclass1 {
    public static void main(String[] args) {
        System.out.println("program starts...");

    Demo d1=new Demo();
       // System.out.println( d1.hashCode());
        int a=d1.hashCode();
        System.out.println(a);
        //System.out.println(d1.toString());
        String b=d1.toString();
        System.out.println(b);


        System.out.println("program ends..");
    }
}
