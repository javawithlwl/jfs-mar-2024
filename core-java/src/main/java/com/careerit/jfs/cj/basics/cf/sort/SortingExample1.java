package com.careerit.jfs.cj.basics.cf.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample1 {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(250);
        list.add(200);
        list.add(50);
        list.add(300);
        list.add(150);
        System.out.println(list);
        Collections.sort(list, (e1, e2) -> e2.compareTo(e1));
        System.out.println(list);
    }
}
