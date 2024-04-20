package com.careerit.jfs.cj.basics.abstractcls;

public class OneImpl extends One{

    @Override
    public int add(int a, int b) {
        System.out.println("The add method is called");
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("The sub method is called");
        return a - b;
    }

}