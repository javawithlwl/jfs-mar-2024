package com.careerit.jfs.cj.basics.enumex;

public class Account {

    private String accNum;
    private double balance;
    private Status status;

    public Account(String accNum, double balance, Status status) {
        this.accNum = accNum;
        this.balance = balance;
        this.status = status;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
