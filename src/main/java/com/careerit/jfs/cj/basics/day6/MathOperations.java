package com.careerit.jfs.cj.basics.day6;

public class MathOperations {

    public static void main(String[] args) {

            int num = 5;
            factorial(num);

            int n = 10;
            fibonacci(n);

            int number = 17;
            checkPrimeOrNot(number);

            int lb = 10;
            int ub = 50;
            printPrimeNumbers(lb, ub);

    }

    // if n 5; then 1 * 2 * 3 * 4 * 5 = 120 or 5 * 4 * 3 * 2 * 1 = 120
    public static void factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }

    // if num is 10; 0 1 1 2 3 5 8 13 21 34
    public static void fibonacci(int n) {
        System.out.println("Fibonacci series of " + n + " numbers is :");
        if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0 1");
        } else if (n > 2) {
            int a = 0;
            int b = 1;
            System.out.print(a + " " + b);
            for (int i = 3; i <= n; i++) {
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }

    }

    // 16 => 1 2 4 8 16
    // 18 => 1 2 3 6 9 18
    // 28 => 1 2 4 7 14 28
    public static void checkPrimeOrNot(int num) {
        System.out.println("\nChecking " + num + " is prime or not");
        if (isPrime(num)) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    public static void printPrimeNumbers(int lb, int ub) {
        System.out.println("Prime numbers between " + lb + " and " + ub + " are :");
        for (int i = lb; i <= ub; i++) {
            boolean isPrime = isPrime(i);
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int i) {
        boolean isPrime = true;
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
