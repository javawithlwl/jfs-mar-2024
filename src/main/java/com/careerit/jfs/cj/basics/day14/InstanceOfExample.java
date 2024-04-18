package com.careerit.jfs.cj.basics.day14;

public class InstanceOfExample {


    public static void main(String[] args) {

        Object[] arr = new Object[]{"Hello", 123, "John", "Doe", true, 123.45, "Manish", 1234, "Kumar"};

        // Get the String objects from the array and print them in upper case

        for(Object obj: arr){
            if(obj instanceof String str){
                System.out.println(str.toUpperCase());
            }
        }


    }
}
