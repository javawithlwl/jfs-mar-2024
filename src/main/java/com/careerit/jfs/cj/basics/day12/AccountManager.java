package com.careerit.jfs.cj.basics.day12;

public class AccountManager {

    public static void main(String[] args) {

        Account acc1 = new Account(625301543269L, "Krish", 5000);
        Account acc2 = new Account(625301543270L, "Anish", 80000);

        acc1.showInfo();

        acc1.deposit(5000);

        acc2.withdraw(30000);

        acc1.showInfo();
        System.out.println("--------------------");
        acc2.showInfo();
    }
}
