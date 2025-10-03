package com.jspider.collection.list;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList list=new LinkedList ();{
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(20);
        }
        System.out.println("list size before pool"+ list.size());
        while (list.isEmpty()==false){
            System.out.println(list.poll());

        }
        System.out.println("list size after the pool-->" + " "+ list.size());


    }
}
