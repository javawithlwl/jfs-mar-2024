package com.careerit.jfs.cj.basics.day11;

public class StringImmutableExample {

    public static void main(String[] args) {

        String name1 = "Krish";
        String name2 = "Krish";
        String name3 = new String("Krish");
        String name4 = new String("Krish");
        System.out.println(name1 == name2);
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));
        System.out.println(name1.equals(name3));


    }
}
