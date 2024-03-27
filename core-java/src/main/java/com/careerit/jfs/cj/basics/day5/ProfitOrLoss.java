package com.careerit.jfs.cj.basics.day5;

import java.util.Scanner;

public class ProfitOrLoss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price :");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price :");
        double sp = sc.nextDouble();

        if(cp > sp) {
            double loss = cp - sp;
            System.out.println("Loss is :" + loss);
        }else if(cp < sp) {
            double profit = sp - cp;
            System.out.println("Profit is :" + profit);
        }else {
            System.out.println("No profit or loss");
        }

    }
}
