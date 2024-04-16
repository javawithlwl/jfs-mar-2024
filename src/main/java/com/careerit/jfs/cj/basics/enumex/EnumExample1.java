package com.careerit.jfs.cj.basics.enumex;



public class EnumExample1 {

    public static void main(String[] args) {

        printDay(Day.FRIDAY);

        for(Day day: Day.values()){
            System.out.println(day);
        }
        showReport(ReportType.HTML);

    }

    public static void showReport(ReportType type) {
        switch(type) {
            case HTML:
                System.out.println("Generating HTML report");
                break;
            case PDF:
                System.out.println("Generating PDF report");
                break;
            case EXCEL:
                System.out.println("Generating Excel report");
                break;
            case CSV:
                System.out.println("Generating CSV report");
                break;
        }
    }

    public static void printDay(Day day) {

        switch(day) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
        }
    }
}
