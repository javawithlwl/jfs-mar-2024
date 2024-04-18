package com.careerit.jfs.cj.basics.day14;

public class AccountManager {

    public static void main(String[] args) {

        SavingsAccount obj1 = new SavingsAccount("SB1001", "Krish", 10000, 5000);
        SavingsAccount obj2 = new SavingsAccount("SB1002", "Manoj", 20000, 5000);
        CurrentAccount obj3 = new CurrentAccount("CA1001", "Alibaba", 400000, 10000);
        CurrentAccount obj4 = new CurrentAccount("CA1002", "SysInfo", 500000, 10000);
        Account[] accounts = new Account[]{obj1, obj2, obj3, obj4};

        for (Account acc : accounts) {
            acc.withdraw(1000);
            acc.deposit(500);
            acc.showInfo();
        }


    }
}
