package com.jspider.collection.list;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq1=new PriorityQueue<Integer>();{

            pq1.add(20);
            pq1.add(20);
            pq1.add(10);
            pq1.add(40);
            pq1.add(30);
            pq1.add(50);

            for (Integer e:pq1){
                System.out.println(e); //not sorted order.
            }

            System.out.println();
            while (pq1.isEmpty()==false){
                System.out.println(pq1.poll()); //sorted order.
            }
        }
    }
}
