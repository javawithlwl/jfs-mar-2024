package com.careerit.jfs.cj.basics.abstractcls;

public class GameManager {

    public static void main(String[] args) {

        Game game = new Car();
        game.start();
        game.play();
        game.stop();
    }
}
