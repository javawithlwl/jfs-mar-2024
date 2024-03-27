package com.careerit.jfs.cj.basics.day5;

import java.util.Scanner;

public class BiggestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3 :");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is biggest number");
        }else if(num2 > num3) {
            System.out.println(num2 + " is biggest number");
        }else {
            System.out.println(num3 + " is biggest number");
        }



    }
}
