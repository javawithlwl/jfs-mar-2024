package com.careerit.jfs.cj.basics.generics;

import java.util.List;

public class GenericsExample7 {

    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,50);
        printElement(list);

        List<Double> list1 = List.of(10.5,20.5,30.5,40.5,50.5);
        printElement(list1);
    }

    public static void printElement(List<? extends Number> list){
        for(Number num:list){
            System.out.println(num);
        }
    }

   /* public static void printElement1(List<? super Integer> list){
        for(Object obj:list){
            System.out.println(obj);
        }
    }*/
}
