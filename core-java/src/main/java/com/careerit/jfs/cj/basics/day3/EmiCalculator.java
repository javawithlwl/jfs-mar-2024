package com.careerit.jfs.cj.basics.day3;

import java.util.Scanner;

public class EmiCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest:");
        double r = sc.nextDouble(); // (Percentage for year)
        System.out.println("Enter the time in months:");
        int t = sc.nextInt();
        r = r / 12 / 100;
        double emi = p * r * Math.pow(1+ r, t) / (Math.pow(1 + r, t) - 1);
        double emiPerMonth = Math.round(emi);
        double totalInterest = Math.round(emi * t - p);
        double totalAmount = Math.round(emi * t);
        System.out.println("EMI per month :"+emiPerMonth);
        System.out.println("Total interest :"+totalInterest);
        System.out.println("Total amount :"+totalAmount);

    }
}
