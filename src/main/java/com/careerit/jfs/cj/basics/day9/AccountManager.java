package com.careerit.jfs.cj.basics.day9;

public class AccountManager {

    public static void main(String[] args) {

        Account acc1 = new Account(1001, "Krish", 10000);
        Account acc2 = new Account(1002, "Manoj", 20000);
        Account acc3 = new Account(1003, "Charan", 30000);

        acc1.deposit(5000);
        acc2.withdraw(10000);
        acc3.withdraw(20000);

        acc1.showAccountInfo();
        System.out.println("-------------------------------");
        acc2.showAccountInfo();
        System.out.println("-------------------------------");
        acc3.showAccountInfo();
    }
}
