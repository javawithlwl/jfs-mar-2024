package com.careerit.jfs.cj.basics.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;



public class GenericsExample1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Java");
        list.add("Python");

        // Print all string elements from the list in uppercase
        for(String obj:list){
            System.out.println(obj.toUpperCase());
        }
    }



}
