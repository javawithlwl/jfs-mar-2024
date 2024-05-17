package com.careerit.jfs.cj.basics.day14;

public class CurrentAccount extends  Account{

        private double overDraft;

        public CurrentAccount(String accNum, String name, double balance,double overDraft) {
            super(accNum, name, balance);
            this.overDraft = overDraft;
        }

        @Override
        public void withdraw(double amount) {
            if(balance + overDraft < amount) {
                System.out.println("Insufficient balance");
            }else {
                balance -= amount;
                System.out.println("Amount "+amount+" is debited from your account");
            }
        }
}
