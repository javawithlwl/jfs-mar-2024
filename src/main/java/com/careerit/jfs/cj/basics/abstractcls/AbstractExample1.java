package com.careerit.jfs.cj.basics.abstractcls;

abstract class  Ab1{
    public abstract void m1();
    public abstract void m2();
    public abstract void m3();
}
abstract  class Ab2 extends Ab1{
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m3() {
        System.out.println("m3 method");
    }
}
class Demo extends  Ab2{
    @Override
    public void m2() {
        System.out.println("m2 method");
    }
}
public class AbstractExample1 {
}
