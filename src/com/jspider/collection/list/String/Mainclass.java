package com.jspider.collection.list.String;

public class Mainclass {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("hello");
        StringBuffer sb2=new StringBuffer("hello");

        int h1=sb1.hashCode();
        int h2=sb2.hashCode();
        System.out.println("h1:"+ h1);
        System.out.println("h2:"+h2);

        String s1=sb1.toString();
        String s2=sb2.toString();
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);

        boolean res=sb1.equals(sb2);
        System.out.println("sb1 equals(sb2):"+res);

        sb1=sb2.append("HII");
        System.out.println("append to sb1:"+sb1);


    }
}
