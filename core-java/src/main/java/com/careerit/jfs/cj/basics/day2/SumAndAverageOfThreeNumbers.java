package com.careerit.jfs.cj.basics.day2;

public class SumAndAverageOfThreeNumbers {

    public static void main(String[] args) {

        float num1 = 10.50f;
        float num2 = 20.50f;
        float num3 = 30.50f;

        float sum = num1 + num2 + num3;
        float avg = sum / 3;
        System.out.println("The sum of "+num1+","+num2+","+num3+" is :"+sum);
        System.out.println("The average of "+num1+","+num2+","+num3+" is :"+avg);
    }
}
