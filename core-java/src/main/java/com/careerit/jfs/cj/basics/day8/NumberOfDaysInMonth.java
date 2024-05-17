package com.careerit.jfs.cj.basics.day8;

public class NumberOfDaysInMonth {


    public static void main(String[] args) {
        int year = 2024;
        int month = 2;
        NumberOfDaysInMonth obj = new NumberOfDaysInMonth();
        int days = obj.getDaysIn(year, month);
        System.out.println("Number of days in month " + obj.getMonthName(month) + " of year " + year + " is " + days);

        String str = "corejava";
        int vowels = obj.getNoVowels(str);
        System.out.println("Number of vowels in " + str + " is " + vowels);
    }

    public int getNoVowels(String str) {
        // vowels a,e,i,o,u, A, E, I, O, U
        // corejava => 3
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowels++;
                    break;
                default:
                    break;
            }
        }
        return vowels;
    }


    public String getMonthName(int monthNum) {
        return switch (monthNum) {
            case 1 ->{
                System.out.println("Wish you a happy new year");
                yield "January";
            }
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalArgumentException("Invalid month number");
        };
    }

    public int getDaysIn(int year, int month) {
        int days = -1;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
            default -> throw new IllegalArgumentException("Invalid month number");
        }
        return days;
    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }
}
