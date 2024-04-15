package com.careerit.jfs.cj.basics.staticandfinal;

class Outer{

    public void showOuter() {
        System.out.println("Outer class");
    }
    static class  Inner{
        public void showInner() {
            System.out.println("Inner class");
        }
    }
}
public class StaticInnerClassDemo {
}
