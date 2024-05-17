package com.careerit.jfs.cj.basics.day7;

import java.util.Scanner;

public class MultiplicationOfTable {


    public static void main(String[] args) {
        // print tables between 1 to 20
        for (int num = 1; num <= 20; num++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
            System.out.println("-------------------------------------------------");
        }
        printPattern(10);
        generateFirstNPrimeNumbers(20);

    }

    // if n value is 5
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // if n value is 5 then output should be 2,3,5,7,11
    // if n value is 10 then output should be 2,3,5,7,11,13,17,19,23,29
    // if n value is 20 then output should be 2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71
    public static void generateFirstNPrimeNumbers(int n){
        int count = 0;
        for(int i=2;;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
            if(count == n){
                break;
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2 || (num % 2 == 0 && num != 2)) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
