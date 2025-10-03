package com.jspider.collection.list;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lh1=new LinkedHashSet<Integer>();{
            lh1.add(10);
            lh1.add(null);
            lh1.add(30);
            lh1.add(20);
            lh1.add(40);
            lh1.add(50);
            for (Integer val:lh1){
                System.out.println(val);

            }
            System.out.println(" size of linkedhashset :"+lh1.size());
        }
    }
}
