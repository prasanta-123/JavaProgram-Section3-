package com.jspider.collection.list;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1=new Hashtable<Integer,String>();{
            ht1.put(1,"A");
            ht1.put(2,"B");
            ht1.put(3,"c");
            ht1.put(4,"D");
            ht1.put(5,"E");
            System.out.println("HASHTABLE-->");
            System.out.print(ht1);

            System.out.println("----------------");


            HashMap<Integer,String> hm1=new HashMap<Integer,String>();{
                hm1.put(1,"A");
                hm1.put(2,"B");
                hm1.put(3,"C");
                hm1.put(4,"D");
                hm1.put(5,"E");
                hm1.put(6,"A");
                hm1.put(null,"X");
                System.out.print("HASHMAP--->");
                System.out.println(hm1);
            }

        }
    }
}
