package com.careerit.jfs.cj.basics.day9;

import java.util.Arrays;

public class ArrayExample2 {

    public static void main(String[] args) {
        int[] inputArr = new int[]{10, 20, 30, 40, 50};
        int[] revArr = reverseArray(inputArr);
        System.out.println(Arrays.toString(revArr));
        int[] primeArr = getPrimeInRange(10, 50);
        System.out.println(Arrays.toString(primeArr));
        int[] arr = new int[]{1, 2, 3, 2, 1};
        System.out.println(isPalindrome(arr));

        int[] arr1 = new int[]{10,20,30,40,50};
        System.out.println(getMaxElement(arr1));
        System.out.println(getMinElement(arr1));
    }

    // input : [10,20,30,40,50] -> [50,40,30,20,10]
    public static int[] reverseArray(int[] arr) {
        int[] revArr = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            revArr[j] = arr[i];
        }
        return revArr;
    }

    public static int[] getPrimeInRange(int lb, int ub) {
        int[] primeArr = new int[countPrimeNumbers(lb, ub)];
        int index = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                primeArr[index++] = i;
            }
        }
        return primeArr;
    }


    private static int countPrimeNumbers(int lb, int ub) {
        int count = 0;
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
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

    public static boolean isPalindrome(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }

    public static int getMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


}
