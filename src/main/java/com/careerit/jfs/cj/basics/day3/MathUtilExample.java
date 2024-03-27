package com.careerit.jfs.cj.basics.day3;

public class MathUtilExample {

    public static void main(String[] args) {

            int num1 = 3;
            int num2 = 5;

            // 3 ^ 5 = 243
            double pow = Math.pow(num1, num2);
            System.out.println(num1+" ^ "+num2+" = "+pow);
            int big = Math.max(num1, num2);
            System.out.println("Biggest of "+num1+","+num2+" is :"+big);
    }
}
