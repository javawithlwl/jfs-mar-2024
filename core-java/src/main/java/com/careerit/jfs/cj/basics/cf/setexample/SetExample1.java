package com.careerit.jfs.cj.basics.cf.setexample;


// What is difference between List and Set in Java?
// Ans: List is an ordered collection of elements and Set is an unordered collection of elements.
//      List allows duplicate elements and Set doesn't allow duplicate elements.
//      List allows multiple null elements and Set allows only one null element.
//      Index based operations are possible in List and not in Set.

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Smith");
        set.add("John");
        set.add("Doe");
        set.add("John");

        System.out.println(set);
    }
}

// Add will compare the hashcode and equals method of the object to check the duplicate element.