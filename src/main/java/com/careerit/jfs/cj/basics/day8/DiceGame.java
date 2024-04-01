package com.careerit.jfs.cj.basics.day8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Generate a random number between 1 to 6
        int generatedNumber = ThreadLocalRandom.current().nextInt(1, 7);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess the number between 1 to 6:");
            int userNumber = sc.nextInt();
            if(userNumber == generatedNumber) {
                System.out.println("You won the game, you guessed the number in " + i + " attempts");
                break;
            }
            if(i==3){
                System.out.println("You lost the game, the number is : "+generatedNumber);
            }else{
                System.out.println("Your guess is wrong, try again");
            }
        }

    }
}
