package com.careerit.jfs.cj.basics.cf;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

    public static void main(String[] args) {

        String data = "Rajesh,Krish,Manoj,Charan,Krish,Ramesh,Suresh,Manoj";
        String[] names = data.split(",");
        List<String> namesList = new ArrayList<>();

        for(String name:names) {
            if(!namesList.contains(name)) {
                namesList.add(name);
            }
        }
        System.out.println(namesList);


    }
}
