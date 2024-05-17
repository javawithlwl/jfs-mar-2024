package com.careerit.jfs.cj.basics.enumex;

public class AccountManager {

    public static void main(String[] args) {

        String data = "1001,10000,8ee62eeb-79e1-42ae-9845-f7b14fd19d1e";

        String[] arr = data.split(",");
        String accNo = arr[0];
        double balance = Double.parseDouble(arr[1]);
        String statusId = arr[2];

        Status status = Status.fromId(statusId);

        Account account = new Account(accNo, balance, status);
        System.out.println(account.getAccNum());
        System.out.println(account.getBalance());
        System.out.println(account.getStatus());



    }
}
