package com.careerit.jfs.cj.basics.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Account {
        private String accNumber;
        private String name;
        private double balance;

        public void withdraw(double amount) throws InsufficientBalanceException {
            if(balance < amount){
                throw new InsufficientBalanceException("Insufficient balance in the account");
            }
            balance -= amount;
            System.out.println("Amount "+amount+" withdrawn successfully");
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Amount "+amount+" deposited successfully");
        }

        public void showInfo() {
            System.out.println("Account number :"+accNumber);
            System.out.println("Name :"+name);
            System.out.println("Balance :"+balance);
        }

}
