package com.careerit.jfs.cj.basics.day7;

public class NumberOperationsUsingWhile {

    public static void main(String[] args) {

        printSumOfDigits(1234);

    }

    public static void printSumOfDigits(int num){
            int sum = 0;
            int temp = num;
            while(temp != 0){
                int r = temp % 10;
                sum = sum + r;
                temp = temp / 10;
            }
        System.out.println("The sum of digits of "+num+" is "+sum);
    }
}
