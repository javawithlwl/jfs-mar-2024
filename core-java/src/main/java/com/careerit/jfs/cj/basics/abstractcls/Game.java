package com.careerit.jfs.cj.basics.abstractcls;

public abstract class Game {

    public void start() {
        System.out.println("The game "+this.getClass().getSimpleName()+" started");
    }
    public abstract void play();
    public void stop() {
        System.out.println("The game "+this.getClass().getSimpleName()+" stopped");
    }
}
