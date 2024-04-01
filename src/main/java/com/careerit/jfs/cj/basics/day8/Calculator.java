package com.careerit.jfs.cj.basics.day8;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the num1 value:");
            int num1 = sc.nextInt();
            System.out.println("Enter the num2 value:");
            int num2 = sc.nextInt();
            System.out.println("Enter the operation (+,-,*,/):");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("The sub of " + num1 + " and " + num2 + " is " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("The mul of " + num1 + " and " + num2 + " is " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("The div of " + num1 + " and " + num2 + " is " + (num1 / num2));
                    break;
                default:
                    System.out.println("Invalid operation");
            }
            System.out.println("Do you want to continue (yes/no):");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

    }
}
