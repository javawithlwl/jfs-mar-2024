package com.careerit.jfs.cj.basics.day9;

public class ArraysExample1 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 13, 14};
        System.out.println("The length of array is : " + arr.length);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = sum / (double) arr.length;
        System.out.println("The sum of array elements is : " + sum);
        System.out.println("The avg of array elements is : " + avg);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
