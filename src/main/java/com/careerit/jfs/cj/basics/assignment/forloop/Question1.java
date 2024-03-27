package com.careerit.jfs.cj.basics.assignment.forloop;

import java.util.Scanner;

/*Write a program to generate the first 'N' natural numbers. Accept the value of 'N' from the user.

        Expected output:

        Enter the number of natural numbers to be generated:
        5
        First 5 natural numbers are : 1 2 3 4 5
*/
public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of natural numbers to be generated:");
        int N = sc.nextInt();
        System.out.print("First "+N+" natural numbers are : ");
        for(int i=1;i<=N;i++){
            System.out.print(i+" ");
        }
    }
}
