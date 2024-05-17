package com.careerit.jfs.cj.basics.day9;

public class Account {

        private int accNum;
        private String name;
        private double balance;

        public Account(int accNum, String name, double balance) {
            this.accNum = accNum;
            this.name = name;
            this.balance = balance;
        }

        public void withdraw(double amount) {
            if(amount <= balance) {
                balance -= amount;
                System.out.println("Amount "+amount+" is withdrawn successfully");
            }else {
                System.out.println("Insufficient balance");
            }
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Amount "+amount+" is deposited successfully");
        }

        public void showBalance() {
            System.out.println("The balance in the account is : "+balance);
        }

        public void showAccountInfo() {
            System.out.println("Account number : "+accNum);
            System.out.println("Name : "+name);
            System.out.println("Balance : "+balance);
        }
}
