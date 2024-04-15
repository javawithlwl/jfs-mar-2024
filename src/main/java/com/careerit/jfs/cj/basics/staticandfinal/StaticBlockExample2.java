package com.careerit.jfs.cj.basics.staticandfinal;

public class StaticBlockExample2 {

    static {
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
    }

    static{
        System.out.println("Static block 1");
    }
}
