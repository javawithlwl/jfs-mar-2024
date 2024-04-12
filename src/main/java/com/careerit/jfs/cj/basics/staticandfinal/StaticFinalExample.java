package com.careerit.jfs.cj.basics.staticandfinal;

final class MyMathCls {


}

public class StaticFinalExample {

    public static void main(String... args) {
        StaticFinalExample obj = new StaticFinalExample();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(obj.add(10));
        System.out.println(Math.sqrt(16));
    }

    public final int add(int a, int b) {
        return a + b;
    }

    public final int add(int a, int b, int c) {
        return a + b + c;
    }

    public final int add(int... arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }



}
