package com.careerit.jfs.cj.basics.day9;

import java.util.Arrays;

public class ArrayExample3 {


    public static void main(String[] args) {
            int[] arr1 = new int[]{1,2,3,4,5,6};
            int[] arr2 = new int[]{1,2,3,4,5,6};
            System.out.println(isEquals(arr1, arr2));
    }

    public static int occurrenceOfElement(int[] arr, int ele) {
        int count = 0;
        for (int num : arr) {
            if (num == ele) {
                count++;
            }
        }
        return count;
    }

    public static boolean searchElement(int[] arr, int ele) {
        for (int num : arr) {
            if (num == ele) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsAll(int[] arr1, int[] arr2) {
        for (int ele : arr2) {
            if (!searchElement(arr1, ele)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEquals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

}
