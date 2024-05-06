package com.careerit.jfs.cj.basics.exception;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExceptionExample3 {

    public static void main(String[] args) {

            int lb = 10;
            int ub = 20;
            try {
                List<Integer> primeList = getPrimeInRange(lb, ub);
                System.out.println(primeList);
            }catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("End of main method");
    }

    public static List<Integer> getPrimeInRange(int lb, int ub) {
        return IntStream.rangeClosed(lb, ub)
                .filter(ExceptionExample3::isPrime)
                .boxed()
                .toList();
    }

    public static boolean isEven(int num) {
        return num / 0 == 0;
    }

    public static boolean isPrime(int num) {
        if(num < 2 || (isEven(num) && num != 2)){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
