package com.careerit.jfs.cj.basics.day14;

class CM1{

    int a = 10;
    public void show1(){
        System.out.println("Show method from CM1");
    }
}
class CM2 extends CM1{
    int a = 1000;
    @Override
    public void show1(){
        System.out.println("Show method from CM2");
    }
    public void show2(){
        System.out.println("Show method from CM2");
    }
}

class CM3 extends CM2{

    public void show1(){
        System.out.println("Show method from CM3");
    }
    public void show2(){
        System.out.println("Show method from CM3");
    }
    public void show3(){
        System.out.println("Show method from CM3");
    }

}
public class InheritanceExample2 {

    public static void main(String[] args) {

            CM1 obj = new CM3();
            obj.show1();



    }
}
