package com.careerit.jfs.cj.basics.day6;

import java.util.Scanner;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N value:");
        int N = sc.nextInt();

        // Sum of first N numbers
        // Sum of first N even numbers
        // Sum of first N odd numbers

        // if N value is 5; then sum of first 5 numbers is 1+2+3+4+5 = 15; even numbers 2+4 = 6; odd numbers 1+3+5 = 9

        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of first " + N + " numbers is : " + sum);
        System.out.println("Sum of first " + N + " even numbers is : " + evenSum);
        System.out.println("Sum of first " + N + " odd numbers is : " + oddSum);

    }
}
