package com.careerit.jfs.cj.basics.day9;

public class ForEachLoopExample {

    public static void main(String[] args) {

        String[] arr = new String[]{"Java", "Python", "C", "C++", "JavaScript"};
        int[] numArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        for (String ele : arr) {
            System.out.println(ele);
        }

        for(int ele : numArr) {
            System.out.println(ele);
        }
    }
}
