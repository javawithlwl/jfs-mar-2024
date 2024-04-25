package com.careerit.jfs.cj.basics.cf;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ListExample5 {

    public static void main(String[] args) {

        List<Integer> numList = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numList.add(ThreadLocalRandom.current().nextInt(10, 100));
        }
        System.out.println(numList);

        // Get even numbers from the list and store into another list

       /* List<Integer> evenList = new ArrayList<>();

        for (int ele : numList) {
            if (ele % 2 == 0) {
                evenList.add(ele);
            }
        }*/

        List<Integer> evenList = numList.stream().filter(e -> e % 2 == 0).toList();
        System.out.println(evenList);

        // Double  each element in the num list and store into another list

        /*List<Integer> doubleNumList = new ArrayList<>();

        for (int ele : numList) {
            doubleNumList.add(ele * 2);
        }*/
        List<Integer> doubleNumList = numList.stream().map(e -> e * 2).toList();
        System.out.println(doubleNumList);

        // Get all odd numbers from the num list, increment by 1 if num is divisible by 5 collect elements into another list

        /*List<Integer> resList = new ArrayList<>();

        for(int ele:numList) {
            if(ele % 2 != 0) {
                ele = ele + 1;
                if(ele % 5 == 0) {
                    resList.add(ele);
                }
            }
        }*/

        List<Integer> resList = numList.stream()
                .filter(e -> e % 2 != 0)
                .map(e -> e + 1)
                .filter(e -> e % 5 == 0)
                .toList();

        System.out.println(resList);

    }
}
