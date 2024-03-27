package com.careerit.jfs.cj.basics.day3;

import java.util.Scanner;

public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empno:");
        int empno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the salary:");
        double salary = sc.nextDouble();

        System.out.println("Empno :" + empno);
        System.out.println("Name :" + name);
        System.out.println("Salary :" + salary);

    }
}
