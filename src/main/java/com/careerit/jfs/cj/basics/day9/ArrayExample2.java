package com.careerit.jfs.cj.basics.day9;

import java.util.Arrays;

public class ArrayExample2 {

    public static void main(String[] args) {
        int[] inputArr = new int[] { 10, 20, 30, 40, 50 };
        int[] revArr = reverseArray(inputArr);
        System.out.println(Arrays.toString(revArr));
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
        return null;
    }


    public static boolean isPalindrome(int[] num) {
        return false;
    }

    public static int getMaxElement(int[] arr) {
        return 0;
    }

    public static int getMinElement(int[] arr) {
        return 0;
    }


}
