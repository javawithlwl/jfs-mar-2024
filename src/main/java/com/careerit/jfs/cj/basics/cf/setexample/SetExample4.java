package com.careerit.jfs.cj.basics.cf.setexample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample4 {

    public static void main(String[] args) {

        List<String> list1 = List.of("John", "Smith", "Doe", "Suresh");
        List<String> list2 = List.of("Smith", "Doe", "Suresh", "Krish");
        List<String> list3 = List.of("Smith", "Doe", "Suresh", "Ramana");

        Set<String> set1 = new HashSet<>();
        set1.addAll(list1);
        set1.addAll(list2);
        set1.addAll(list3);

        System.out.println(set1);

    }
}
