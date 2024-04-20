package com.careerit.jfs.cj.basics.interfaceexamples;

import java.util.Scanner;

public class GameManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Car 2.Bike 3.Ship");
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();

        GameType gameType = switch (ch) {
            case 1 -> GameType.CAR;
            case 2 -> GameType.BIKE;
            case 3 -> GameType.SHIP;
            default -> throw new IllegalArgumentException("Unexpected value: " + ch);
        };
        Game game = getGame(gameType);
        game.start();
        game.play();
        game.stop();

    }

    public static Game getGame(GameType gameType){
        return switch (gameType) {
            case CAR -> new Car();
            case BIKE -> new Bike();
            case SHIP -> new Ship();
            default -> throw new IllegalArgumentException("Unexpected value: " + gameType);
        };
    }
}
