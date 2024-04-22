package com.careerit.jfs.cj.basics.interfaceexamples.types;

import java.util.function.BiFunction;
import java.util.function.Predicate;

@FunctionalInterface
interface I1 {
    default int countPrimes(int lb, int ub) {
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    boolean isPrime(int num);

}
public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunction = (a, b) -> a * b;

        int res = biFunction.apply(10, 20);
        System.out.println(res);

        Predicate<String> predicate = s -> s.startsWith("a");
        System.out.println(predicate.test("apple"));
        System.out.println(predicate.test("banana"));
    }
}
