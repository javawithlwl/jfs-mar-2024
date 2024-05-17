package com.careerit.jfs.cj.basics.exception;

import java.util.Scanner;

public class ExceptionExample1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start of main method");
        System.out.println("Enter the num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2:");
        int num2 = sc.nextInt();
        try {
            int res = num1 / num2;
            System.out.println("Result :" + res);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of main method");

    }
}
