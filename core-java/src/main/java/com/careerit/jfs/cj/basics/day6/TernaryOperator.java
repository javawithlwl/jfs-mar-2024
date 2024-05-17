package com.careerit.jfs.cj.basics.day6;

public class TernaryOperator {


    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        /*int max;
        if(num1 > num2){
            max = num1;
        }else{
            max = num2;
        }*/
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Max of " + num1 + " and " + num2 + " is " + max);
        // Ternary operator: syntax (condition)?true-part:false-part


    }
}
