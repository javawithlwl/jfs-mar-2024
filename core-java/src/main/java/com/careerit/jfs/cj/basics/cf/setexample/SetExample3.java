package com.careerit.jfs.cj.basics.cf.setexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample3 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Smith");
        set.add("Doe");
        set.add("Suresh");

        for (String name : set) {
            System.out.println(name);
        }

        set.forEach(System.out::println);

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if(name.equals("Smith")) {
                iterator.remove();
            }
        }

        System.out.println(set);
    }
}

