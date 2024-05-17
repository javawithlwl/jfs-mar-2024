package com.careerit.jfs.cj.basics.staticandfinal;

public final class MyConstants {

        private MyConstants(){}

        public static final int NO_OF_MONTHS = 12;
        public static final int NO_OF_DAYS = 365;
        public static final int DAYS_IN_WEEK = 7;

        public static int noOfDaysInMonth(int year,int month){
            return
                switch(month){
                    case 1,3,5,7,8,10,12 -> 31;
                    case 4,6,9,11 -> 30;
                    case 2 -> isLeapYear(year) ? 29 : 28;
                    default -> throw new IllegalArgumentException("Invalid month");
                };
        }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
