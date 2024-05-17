package com.careerit.jfs.cj.basics.interfaceexamples;

public class Bike extends AbstractGame implements Game{

    @Override
    public void play() {
        System.out.println("The game "+this.getClass().getSimpleName()+" is playing and please wear helmet");
    }

}
