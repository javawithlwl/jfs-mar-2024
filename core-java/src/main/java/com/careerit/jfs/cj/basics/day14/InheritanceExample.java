package com.careerit.jfs.cj.basics.day14;

// In every class super class is Object class
class One extends Object{
    public One(){
        super();
        System.out.println("One class constructor");
    }

}
class Two extends One{
    public Two() {
        super();
        System.out.println("Two class constructor");
    }
}
class Three extends Two{
    public Three() {
        super();
        System.out.println("Three class constructor");
    }
}
public class InheritanceExample {

    public static void main(String[] args) {
        One obj = new Three();
    }
}
