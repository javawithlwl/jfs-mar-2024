package com.careerit.jfs.cj.basics.day5;

import java.util.Scanner;

public class BillAndDiscountCalculator {


        // 1. Take the input of the bill amount from the user. if the bill amount is greater than 5000 then give 20% discount else give 10% discount.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill amount :");
        double billAmount = sc.nextDouble();
        double discount = 0;

        if(billAmount > 5000) {
            discount = billAmount * 0.20;
        }else {
            discount = billAmount * 0.10;
        }
        double netAmount = billAmount - discount;
        System.out.println("Bill Amount :"+billAmount);
        System.out.println("Discount    :"+discount);
        System.out.println("Net Amount  :"+netAmount);

    }
}
