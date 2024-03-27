package com.careerit.jfs.cj.basics.day4;

public class BasicInterviewQuestions {

    // Create method which takes year and month as input and return the number of days in that month

    public int daysInMonth(int year, int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };

    }

    // Create method which takes year as input and return if the year is leap year then return true else false

    public boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // Create method which takes day number and return the day name

    public String dayName(int day) {
        return switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day number";
        };
    }

    // Create method which takes 3 numbers as input and return the biggest number

    public int biggestOf(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Create method which takes 3 numbers as input and return the smallest number

    public int smallestOf(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }


    // Create method which takes 3 numbers as input and return the sum of the numbers
    public int sumOf(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        BasicInterviewQuestions obj = new BasicInterviewQuestions();
        int num1 = 10, num2 = 20, num3 = 30;
        int sum = obj.sumOf(num1, num2, num3);
        System.out.println("Sum of " + num1 + "," + num2 + "," + num3 + " is :" + sum);

        int big = obj.biggestOf(num1, num2, num3);
        System.out.println("Biggest of " + num1 + "," + num2 + "," + num3 + " is :" + big);
        int small = obj.smallestOf(num1, num2, num3);
        System.out.println("Smallest of " + num1 + "," + num2 + "," + num3 + " is :" + small);

        int day = 3;
        String dayName = obj.dayName(day);
        System.out.println("Day name for " + day + " is :" + dayName);
        int year = 2024;
        int month = 2;
        int days = obj.daysInMonth(year, month);
        System.out.println("Number of days in " + month + " month of " + year + " is :" + days);
        boolean isLeapYear = obj.isLeapYear(year);
        System.out.println(year + " is leap year :" + isLeapYear);
    }

}
