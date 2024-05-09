package com.careerit.jfs.cj.basics.generics;

import java.util.List;
import java.util.stream.Stream;

public class GenericsExample4 {

    public static void main(String[] args) {
        Integer i = 10;
        Double d = 10.5;
        String str = "Hello";

        print(i);
        print(d);
        Integer[] arr = { 10, 20, 30, 40, 50 };
        List<Integer> list = covert(arr);
        System.out.println(list);



    }

    public static <T extends Number> void print(T t) {
        System.out.println(t);
    }

    public static <T extends Number & Comparable> List<T> covert(T[] arr){
        return Stream.of(arr).toList();
    }
}
