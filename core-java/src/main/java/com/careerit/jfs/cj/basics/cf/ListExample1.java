package com.careerit.jfs.cj.basics.cf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(345);
        list.add(456);
        System.out.println(list);
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.contains(234));
        System.out.println(list.indexOf(234));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(int i=list.size()-1;i>=0;i--) {
        	System.out.println(list.get(i));
        }

        for(int ele:list) {
        	System.out.println(ele);
        }

        list.forEach(System.out::println);
    }
}
