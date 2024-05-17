package com.careerit.jfs.cj.basics.day8;

import java.util.Scanner;

public class InvoiceGeneration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1.Pdf 2.Excel 3.Csv");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Generating pdf invoice");
                break;
            case 2:
                System.out.println("Generating excel invoice");
                break;
            case 3:
                System.out.println("Generating csv invoice");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
