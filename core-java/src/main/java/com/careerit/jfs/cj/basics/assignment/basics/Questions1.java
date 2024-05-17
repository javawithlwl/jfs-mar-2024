package com.careerit.jfs.cj.basics.assignment.basics;

import java.util.Scanner;

/* Write a program to accept two numbers from the user, calculate the sum and display the same.

        Expected output:

        Enter the num1 value:
        10
        Enter the num2 value:
        20
        Sum of 10 and 20 is 30
 */
public class Questions1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 value:");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 value:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        double avg = sum / 2.0;
        System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
        System.out.println("Average of "+num1+" and "+num2+" is "+avg);
    }

}
