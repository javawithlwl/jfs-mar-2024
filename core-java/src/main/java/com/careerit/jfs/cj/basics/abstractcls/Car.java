package com.careerit.jfs.cj.basics.abstractcls;

public class Car extends  Game{
    @Override
    public void play() {
        System.out.println("You are playing "+this.getClass().getSimpleName()+" game, Please wear seat belt");
    }
}
