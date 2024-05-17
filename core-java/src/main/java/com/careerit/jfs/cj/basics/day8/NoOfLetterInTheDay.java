package com.careerit.jfs.cj.basics.day8;
 enum Day {
     SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }
public class NoOfLetterInTheDay {

    public static void main(String[] args) {
        Day day = Day.THURSDAY;
        NoOfLetterInTheDay obj = new NoOfLetterInTheDay();
        int count = obj.countLettersInDay(day);
        System.out.println("The number of letters in "+day+" is "+count);
    }

     public int countLettersInDay(Day day){

         return switch (day) {
             case SUNDAY , MONDAY , FRIDAY -> 6;
             case TUESDAY -> 7;
             case WEDNESDAY , THURSDAY , SATURDAY -> 9;
             default ->
                 throw new IllegalArgumentException("Invalid day");
         };

     }
}
