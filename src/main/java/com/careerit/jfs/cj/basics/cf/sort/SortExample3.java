package com.careerit.jfs.cj.basics.cf.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample3 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(250);
        list.add(200);
        list.add(50);
        list.add(300);
        list.add(150);

        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);
        System.out.println(sortedList);


    }
}
