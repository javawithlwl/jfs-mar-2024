package com.careerit.jfs.cj.basics.abstractcls;

public class Ship extends Game{

    @Override
    public void play() {
        System.out.println("You are playing "+this.getClass().getSimpleName()+" game, Please wear life jacket");
    }
}
