package com.careerit.jfs.cj.basics.day3;

public class SimpleInterest {

    public static void main(String[] args) {

        float p = 1000;
        float r = 5;
        float t = 2;

        float si = (p * r * t) / 100;
        System.out.println("The simple interest for principal :"+p+", rate :"+r+", time :"+t+" is :"+si);
    }
}
