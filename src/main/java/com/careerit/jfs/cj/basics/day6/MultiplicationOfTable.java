package com.careerit.jfs.cj.basics.day6;

import java.util.Scanner;

public class MultiplicationOfTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to generate the multiplication table :");
        int num1 = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num1 + " * " + i + " = " + (num1 * i));
        }

    }

    // for loop  basic syntax : for(initialization;condition;increment/decrement){ // code block }
    // i++  = i = i + 1
    // i--  = i = i - 1
}
