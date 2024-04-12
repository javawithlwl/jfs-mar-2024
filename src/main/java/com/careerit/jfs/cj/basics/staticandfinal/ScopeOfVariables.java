package com.careerit.jfs.cj.basics.staticandfinal;

public class ScopeOfVariables {
    int duration = 30; // Instance variable
    static String courseName = "Java Full Stack"; // Class variable

    public void showDetails(){
        int duration = 60;  // Local variable
        System.out.println("Duration : "+duration);
        System.out.println("Course Name : "+courseName);
    }

    public void sum(int a,int b){
        int res = a + b;
        System.out.println("Sum : "+res);
    }
}
