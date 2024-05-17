package com.careerit.jfs.cj.basics.abstractcls;

abstract class L1{
    public L1() {
        System.out.println("L1 constructor");
    }
    abstract void m1();
}
class L2 extends L1{
    public L2() {
        System.out.println("L2 constructor");
    }
    @Override
    public void m1() {
        System.out.println("m1 method");
    }
}

public class AbstractClassExample3 {
}
