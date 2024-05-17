package com.careerit.jfs.cj.basics.cf;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

    public static void main(String[] args) {

        List<String> cs = List.of("MKR","PKM","KVR","MVR","JVR");
        List<String> ec = List.of("MKR","LVR","MVR","JVR");
        List<String> is = List.of("MKR","PKM","MPM","JVR");

        // find the common names in all the departments

        List<String> commonNames = new ArrayList<>();
        commonNames.addAll(cs);
        commonNames.addAll(ec);
        commonNames.addAll(is);

        List<String> uniqueNamesList  = new ArrayList<>();
        for(String name:commonNames) {
            if(!uniqueNamesList.contains(name)) {
                uniqueNamesList.add(name);
            }
        }
        System.out.println(uniqueNamesList);

        for(String name:uniqueNamesList) {
            if(cs.contains(name) && ec.contains(name) && is.contains(name)) {
                System.out.println(name);
            }
        }
    }
}
