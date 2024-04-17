package com.careerit.jfs.cj.basics.day14;

public class SavingsAccount extends Account{

    private double minBalance;

    public SavingsAccount(String accNum, String name, double balance,double minBalance) {
        super(accNum, name, balance);
        this.minBalance = minBalance;
    }
}
