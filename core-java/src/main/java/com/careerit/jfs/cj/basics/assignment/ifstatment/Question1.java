package com.careerit.jfs.cj.basics.assignment.ifstatment;

import java.util.Scanner;

/* Write a program to accept a number, if it is negative then covert it to a positive number.

           Expected output:

               Enter a number:
               -10
               The result is: 10
        */
public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        System.out.println("The result is: " + num);
    }
}

