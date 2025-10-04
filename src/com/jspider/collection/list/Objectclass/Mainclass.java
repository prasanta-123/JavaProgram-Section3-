package com.jspider.collection.list.Objectclass;

public class Mainclass {
    public static void main(String[] args) {
        System.out.println("program starts..");

        Object obj1=new Object();
        Object obj2=new Object();
        Object obj3=obj1;
        int  a=obj1.hashCode();
        int b=obj2.hashCode();

        System.out.println("hashcode of obj1 :" +obj1);
        System.out.println("hashcode of obj2 :" +obj2);
        System.out.println("hashcode of obj3: "+obj3);

        System.out.println("_______________");

        String s1=obj1.toString();
        String s2= obj2.toString();
        System.out.println("to String() obj1 :"+s1);
        System.out.println("to String() obj2 :"+s2);

        System.out.println("----------");

//        System.out.println(obj1.equals(obj3));
//        System.out.println(obj1.equals(obj2));

        boolean b1=obj1.equals(obj2);
        System.out.println("b1:"+b1);//false
        boolean b2=obj3.equals(obj1);
        System.out.println("b2:"+b2);//true

        boolean b3=obj1== obj2;
        System.out.println("== operator:"+b3);
        boolean b4=obj3==obj1;
        System.out.println("== operator:"+b4);



        System.out.println("program ends..");
    }
}
