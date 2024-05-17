package com.careerit.jfs.cj.basics.day5;

import java.util.Scanner;

public class BillCalculation {

    public static void main(String[] args) {

        // Bill amount, membership as input, if the bill amount is greater than 5000 and has membership card then give 20% discount;
        // if bill amount is less than 5000 and with membership card discount is 10% else 2%.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        double billAmount = sc.nextDouble();
        System.out.println("Do you have membership card (yes/no) :");
        String membership = sc.next();
        double discount = 0;
        if(billAmount >= 5000 && membership.equalsIgnoreCase("yes")) {
            discount = billAmount * 0.20;
        }else if(billAmount < 5000 && membership.equalsIgnoreCase("yes")) {
            discount = billAmount * 0.10;
        }else{
            discount = billAmount * 0.02;
        }
        System.out.println("Bill Amount :"+billAmount);
        System.out.println("Discount    :"+discount);
        System.out.println("Net Amount  :"+(billAmount - discount));
    }
}
