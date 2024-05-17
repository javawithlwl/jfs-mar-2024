package com.careerit.jfs.cj.basics.staticandfinal;

public class IIBBlockExample {

    static {
        System.out.println("Static block 1");
    }

    {
        System.out.println("IIB block 1");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        IIBBlockExample obj = new IIBBlockExample();
        IIBBlockExample obj1 = new IIBBlockExample();
        IIBBlockExample obj2 = new IIBBlockExample();
    }

}
