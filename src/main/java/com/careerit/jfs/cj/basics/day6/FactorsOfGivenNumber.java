package com.careerit.jfs.cj.basics.day6;

import java.util.Scanner;

public class FactorsOfGivenNumber {

    public static void main(String[] args) {

        // if num is 18, factors are 1,2,3,6,9,18

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
