package com.careerit.jfs.cj.basics.day14;

class CL1 {
    public void show1() {
        System.out.println("Show method from CL1");
    }
}

class CL2 extends CL1 {
    public void show1() {
        System.out.println("Show method from CL2");
    }

    public void show2() {
        System.out.println("Show method from CL2");
    }
}

class CL3 extends CL2 {

    public void show1() {
        System.out.println("Show method from CL3 ");
    }

    public void show2() {
        System.out.println("Show method from CL3");
    }

    public void show3() {
        System.out.println("Show method from CL3");
    }
}

public class TypeCastExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            CL1 obj = getObject();
            if (obj instanceof CL3 cl3) {
                cl3.show1();
                cl3.show2();
                cl3.show3();
            } else if (obj instanceof CL2 cl2) {
                cl2.show1();
                cl2.show2();
            }
        }


}
private static int num = 1;
private static CL1 getObject() {

    if (num % 2 == 0) {
        num++;
        return new CL2();
    }
    num++;
   return new CL3();
}
}
