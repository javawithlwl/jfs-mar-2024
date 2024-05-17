package com.careerit.jfs.cj.basics.day4;

public class Account {

        private int accno;
        private String name;
        private double balance;

        public Account(int accno, String name, double balance){
            this.accno = accno;
            this.name = name;
            this.balance = balance;
        }

        public void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Amount "+amount+" is debited from your account");
            }else{
                System.out.println("Insufficient balance");
            }
        }

        public void deposit(double amount){
            balance += amount;
            System.out.println("Amount "+amount+" is credited to your account");
        }

        public void showDetails(){
            System.out.println("Accno :"+accno);
            System.out.println("Name :"+name);
            System.out.println("Balance :"+balance);
        }

    public static void main(String[] args) {

                Account account1 = new Account(1001, "Krish", 10000);
                Account account2 = new Account(1002, "Manoj", 20000);

                account1.withdraw(5000);
                account2.deposit(10000);

                account1.showDetails();
                System.out.println("--------------------");
                account2.showDetails();
    }
}
