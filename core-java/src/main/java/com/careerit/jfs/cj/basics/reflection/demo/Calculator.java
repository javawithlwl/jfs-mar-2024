package com.careerit.jfs.cj.basics.reflection.demo;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    @TimeIt
    public List<Integer> generatePrimeNumbers(int count) {
        List<Integer> list = new ArrayList<>();
        while (list.size() != count) {
            int num = (int) (Math.random() * 1000);
            if (isPrime(num)) {
                list.add(num);
            }
        }
        return list;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
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
