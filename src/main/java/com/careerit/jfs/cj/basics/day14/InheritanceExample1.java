package com.careerit.jfs.cj.basics.day14;

class C1{

    public C1(int a){
        System.out.println("C1 class constructor");
    }
    {
        System.out.println("Instance block From C1");
    }
}
class C2 extends C1{


    public C2(){
        super(10);
        System.out.println("C2 class constructor");
    }

    {
        System.out.println("Instance block From C2");

    }
}
public class InheritanceExample1 {
    public static void main(String[] args) {
        C2 obj = new C2();
    }
}
