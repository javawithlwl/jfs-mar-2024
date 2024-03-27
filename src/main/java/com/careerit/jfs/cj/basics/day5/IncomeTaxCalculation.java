package com.careerit.jfs.cj.basics.day5;

import java.util.Scanner;

public class IncomeTaxCalculation {


    // Write a program to calculate the income tax based on the following rules
    // 1. If the income is less than 3L no tax
    // 2. If the income is between 3 and 6 5% tax
    // 3. If the income is between 6 and 9 10% tax
    // 4. If the income is between 9 and 12 15% tax
    // 5. If the income is between 12 and 15 20% tax
    // 6. If the income is above 15L 30% tax


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income :");
        double income = sc.nextDouble();

        double tax = 0;
        double range = 300000;
        if(income <= 3_00_000) {
            tax = 0;
        }else if(income > 3_00_000 && income <= 6_00_000) {
            tax = (income - 300000) * 0.05;
        }else if(income > 6_00_000 && income <= 9_00_000) {
            tax = range * 0.05 + (income-600000) * 0.10;
        }else if(income > 9_00_000 && income <= 12_00_000) {
            tax = range * 0.05 + range * 0.10 + (income-900000) * 0.15;
        }else if(income > 12_00_000 && income <= 15_00_000) {
            tax = range * 0.05 + range * 0.10 + range * 0.15 + (income-1200000) * 0.20;
        }else {
            tax = range * 0.05 + range * 0.10 + range * 0.15 + range * 0.20 + (income-1500000) * 0.30;
        }
        System.out.println("Income :"+income);
        System.out.println("Tax    :"+tax);

    }


}
