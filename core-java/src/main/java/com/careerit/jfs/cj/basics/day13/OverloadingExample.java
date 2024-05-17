package com.careerit.jfs.cj.basics.day13;

class MathOperations {

    public int add(int a, int b) {
        System.out.println("int int");
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public int add(char a, int b) {
        System.out.println("char and int");
        return a + b;
    }
    /*public int add(int a,char b){
        return a + b;
    }*/

    // Different parameters => 1. No of params 2. Order of params 3. Type of param


    // byte short int float double long
    // char -> int

}

public class OverloadingExample {

    public static void main(String[] args) {

        MathOperations obj = new MathOperations();
        System.out.println(obj.add(100, 'b'));

        String name = "Hello";

        System.out.println(name.substring(2, 4));
        System.out.println(name.substring(3));
    }
}
