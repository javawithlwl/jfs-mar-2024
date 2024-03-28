package com.careerit.jfs.cj.basics.day6;

public class TernaryOperatorExample2 {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max = max(a, b, c);
        System.out.println("Max of " + a + " and " + b + " and " + c + " is " + max);

        String username = "Haadya";
        String message = greetings(username);
        System.out.println(message);

    }


    public static int max(int a, int b, int c) {
        return (a > b && a > c) ? a: (b > c) ? b : c;
    }

    public static String greetings(String username) {
        String name = username.isEmpty() ? "User" : username;
        return "Hello " + name + ",\n\t Welcome to Java World";
    }
}
