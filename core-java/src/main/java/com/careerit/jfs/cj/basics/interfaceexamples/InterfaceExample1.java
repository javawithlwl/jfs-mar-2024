package com.careerit.jfs.cj.basics.interfaceexamples;

interface  One{
    void m1();
    void m2();
}
interface  Two extends  One{
    void m3();
    void m4();
}
abstract  class Three implements  One,Two{
    @Override
    public void m1(){
        System.out.println("m1 method");
    }
    @Override
    public void m3(){
        System.out.println("m3 method");
    }
}
class  Four extends Three implements  One,Two{
    @Override
    public void m2(){
        System.out.println("m2 method");
    }
    @Override
    public void m4(){
        System.out.println("m4 method");
    }
}
public class InterfaceExample1 {
}
