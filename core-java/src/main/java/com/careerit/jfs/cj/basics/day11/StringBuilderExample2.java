package com.careerit.jfs.cj.basics.day11;

public class StringBuilderExample2 {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Manoj");
        StringBuffer sb2 = new StringBuffer("Manoj");

        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));

        StringBuilder sb = new StringBuilder("charan");
        sb.reverse();
        System.out.println(sb);

        StringBuilder sb3 = new StringBuilder("Manoj");
        String st = sb3.toString();
        System.out.println(st);
    }
}
