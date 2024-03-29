package com.careerit.jfs.cj.basics.day7;

public class BreakAndContinueExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
        printNewPattern();

    }

    // if n value is 10
    // 1 1
    // 2 2
    // 4 4
    // 5 5
    // 7 7
    // 8 8
    // 10 10

    public static void printPattern(int n) {
        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i + " " + i);
        }
    }

    // 1 2
    // 1 3
    // 1 4
    // 2 1
    // 2 3
    // 2 4
    // 3 1
    // 3 2
    // 3 4

    public static void printNewPattern() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }

}
