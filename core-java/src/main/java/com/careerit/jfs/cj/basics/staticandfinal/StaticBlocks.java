package com.careerit.jfs.cj.basics.staticandfinal;

public class StaticBlocks {

    static {
        System.out.println("Static block 1");
    }

    public static void main(String[] args) {

        System.out.println("Main method started");
    }

    static{
        System.out.println("Static block 2");
    }

    static{
        System.out.println("Static block 3");
    }

}
