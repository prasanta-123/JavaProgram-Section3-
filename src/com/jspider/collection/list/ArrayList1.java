package com.jspider.collection.list;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

   ArrayList A1=new ArrayList();
        A1.add(10);
        A1.add(20);
        A1.add(30);
        A1.add(40);
        A1.add(50);
        A1.add(60);

   System.out.println("a1 contains " + A1.size());

//System.out.println(A1.get(0));
        //System.out.println(A1.get(3));
        System.out.println("removing items "+A1.remove(2));
        System.out.println(" after removing a1 contains " + A1.size());

        int ub=A1.size();
        for (int i=0;i<=ub;i++){


        }


    }
}
