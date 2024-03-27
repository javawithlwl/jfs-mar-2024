package com.careerit.jfs.cj.basics.day3;

import java.util.Scanner;

public class SwapOfTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2:");
        int num2 = sc.nextInt();
        System.out.println("Before swap num1 :"+num1+" num2 :"+num2);
        /*int temp = num1;
        num1 = num2;
        num2 = temp;*/

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap num1 :"+num1+" num2 :"+num2);
    }

    // Java comments
    // Single line comment  // Single line comment
    // Multi line comment   /* Multi line comment */
}
