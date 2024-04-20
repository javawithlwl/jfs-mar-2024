package com.careerit.jfs.cj.basics.interfaceexamples;

public abstract class AbstractGame implements Game {

    @Override
    public void start() {
        System.out.println("The game "+this.getClass().getSimpleName()+" is started");
    }

    @Override
    public void stop() {
        System.out.println("The game "+this.getClass().getSimpleName()+" is stopped");
    }
}
