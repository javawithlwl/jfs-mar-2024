package com.careerit.jfs.cj.basics.day10;

import java.util.Arrays;

public class ArrayExampleWith2D {

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        /*for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
        for (int[] arr1 : arr) {
            for (int ele : arr1) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        int sum = diagonalSum(arr);
        System.out.println("The sum of diagonal elements is : " + sum);
        int[] rowSumArr = sumOfEachRow(arr);
        System.out.println("The sum of each row is : " + Arrays.toString(rowSumArr));
        int[] colSumArr = columnSum(arr);
        System.out.println("The sum of each column is : " + Arrays.toString(colSumArr));
    }

    public static int diagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int[] sumOfEachRow(int[][] arr) {
        int[] sumArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            sumArr[index++] = sum;
        }
        return sumArr;
    }

    public static int[] columnSum(int[][] arr) {
        int[] sumArr = new int[arr[0].length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length;j++){
                sum += arr[j][i];
            }
            sumArr[index++] = sum;
        }
        return sumArr;
    }
    // Find the maximum element in the 2D array
    public static int maxElement(int[][] arr){
        return 0;
    }

    // Find the minimum element in the 2D array
    public static int minElement(int[][] arr){
        return 0;
    }

    // Find the number of prime numbers in the 2D array

    public static int countPrimeNumbers(int[][] arr){
        return 0;
    }

}
