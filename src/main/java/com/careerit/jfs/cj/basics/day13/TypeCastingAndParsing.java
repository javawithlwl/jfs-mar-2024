package com.careerit.jfs.cj.basics.day13;
// 1. How many primitive data types are there in Java?
// Ans: 8; byte, short, int, long, float, double, char, boolean

// 2. What are wrapper classes in Java?
// Ans: Wrapper classes are classes that allow primitive data types to be accessed as objects.
// Java provides eight wrapper classes: Byte, Short, Integer, Long, Float, Double, Character, and Boolean.

public class TypeCastingAndParsing {

    public static void main(String[] args) {

        String numStr = "1001";
        int num = Integer.parseInt(numStr);
        System.out.println(++num);

        String salary = "2300.45";
        double empSalary = Double.parseDouble(salary);
        System.out.println(empSalary);

        String data = "1001,Krish,32,sales,5000.50";
        String[] arr = data.split(",");
        int empno = Integer.parseInt(arr[0]);
        String name = arr[1];
        int age = Integer.parseInt(arr[2]);
        String dept = arr[3];
        double empSal = Double.parseDouble(arr[4]);
        System.out.println(empno+" "+name+" "+age+" "+dept+" "+empSal);

        int a = 10;
        double b = a; // Widening casting
        System.out.println(a+" "+b);

        double unitPrice = 100.45;
        int price = (int)unitPrice; // Narrowing casting
        System.out.println(unitPrice+" -> "+price);
        // 99.90 -> 100, 99

        // boxing and unboxing

        Integer obj = 100;
        int value = obj;

    }
}

// What is type casting?
// Ans: Type casting is when you assign a value of one primitive data type to another type.
// In Java, there are two types of casting: Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double
// Narrowing Casting (manually) - converting a larger type to a smaller size type