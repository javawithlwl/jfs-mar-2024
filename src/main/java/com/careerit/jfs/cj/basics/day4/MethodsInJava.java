package com.careerit.jfs.cj.basics.day4;

import java.time.LocalDateTime;

public class MethodsInJava {

    // Method without arguments and without return type

    public void showSystemDateTime() {
        System.out.println("The current date and time is :" + LocalDateTime.now());
    }

    // Method with arguments and without return type

    public void showGreetings(String name) {
        System.out.println("Hello " + name + " Good Morning");
    }

    // Method with arguments and with return type

    public String getFullName(String fname, String lname) {
        return fname + " " + lname;
    }

    // Method without arguments and with return type

    public String getSystemInfo() {
        String osName = System.getProperty("os.name");
        int processors = Runtime.getRuntime().availableProcessors();
        return "OS Name :"+osName+", Processors :"+processors;
    }

    public int sumOfFirstNNaturalNumbers(int n) {
           return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        MethodsInJava obj = new MethodsInJava();
        obj.showSystemDateTime();
        obj.showGreetings("Krish");
        String fullName = obj.getFullName("Krish", "Naik");
        System.out.println("Full Name :" + fullName);
        String sysInfo = obj.getSystemInfo();
        System.out.println(sysInfo);
        int n = 10;
        int sum = obj.sumOfFirstNNaturalNumbers(n);
        System.out.println("The sum of first "+n+" natural numbers is :"+sum);
    }

}
