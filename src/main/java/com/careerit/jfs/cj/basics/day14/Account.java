package com.careerit.jfs.cj.basics.day14;
public class Account {

        String accNum;
        String name;
        double balance;

        public Account(String accNum, String name, double balance) {
            this.accNum = accNum;
            this.name = name;
            this.balance = balance;
        }

        public void withdraw(double amount) {
            if(amount > balance) {
                System.out.println("Insufficient balance");
            }else {
                balance -= amount;
                System.out.println("Amount "+amount+" is debited from your account");
            }
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Amount "+amount+" is credited to your account");
        }

        public void showInfo() {
            System.out.println("Account Number : "+accNum);
            System.out.println("Name           : "+name);
            System.out.println("Balance        : "+balance);
        }
}
