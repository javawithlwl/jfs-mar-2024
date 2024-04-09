package com.careerit.jfs.cj.basics.day12;

public class Account {
    private long accNumber;
    private String name;
    private double balance;

    public Account(long accNumber,String name,double balance){
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Your account " + maskAccountNumber(accNumber) + " is debited with " + amount + " and balance is " + balance);
        }else {
            System.out.println("Sorry! Insufficient funds");
        }
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Your account " + maskAccountNumber(accNumber) + " is credited with " + amount + " and balance is " + balance);
    }

    public void showInfo() {
        System.out.println("Account Number :" + maskAccountNumber(accNumber));
        System.out.println("Account Name   :" + name);
        System.out.println("Balance        :" + balance);
    }

    private String maskAccountNumber(long accountNumber){
        String str = String.valueOf(accountNumber);
        return "********" + str.substring(str.length()-4);
    }

}

// Where does java compiler adds the default constructor ?
// When does java compiler adds the default constructor ?



