package com.careerit.jfs.cj.basics.day5;

import java.util.Scanner;

public class SimpleIfExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        System.out.println("Entered age is :"+num);
    }
}
