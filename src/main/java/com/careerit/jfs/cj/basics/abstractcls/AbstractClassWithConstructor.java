package com.careerit.jfs.cj.basics.abstractcls;

abstract class C1 {
    public C1() {
        System.out.println("C1 constructor");
    }

}
class C2 extends C1{
    public C2() {
        System.out.println("C2 constructor");
    }
}

public class AbstractClassWithConstructor {

        public static void main(String[] args) {
            C1 obj = new C2();
        }
}
