package com.careerit.jfs.cj.basics.day11;

public class StringMethodsExample1 {

    public static void main(String[] args) {

        String name = "Manoj";
        System.out.println(name.substring(0, 3));

        String[] names = {"Manoj","Charan","Krish","Manish","Rahul"};

        for(String ele:names){
            String n = ele.substring(0,3).toUpperCase();
            System.out.println(n);
        }

        String data = "Manoj,Charan,Krish,Manish,Rahul";
        String[] arr = data.split(",");
        for(String ele:arr){
            System.out.println(ele.toUpperCase());
        }
    }
}
