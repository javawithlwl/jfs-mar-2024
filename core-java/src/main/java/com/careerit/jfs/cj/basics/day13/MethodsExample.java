package com.careerit.jfs.cj.basics.day13;

class MyMathUtil{

        public int add(int a,int b){
            return a + b;
        } // instance methods
        public static int pow(int a,int b){
            return (int)Math.pow(a, b);
        } // class methods
}
public class MethodsExample {

    // instance methods
    // class methods

    public static void main(String[] args) {
        MyMathUtil obj = new MyMathUtil();
        System.out.println(obj.add(10, 20));
        System.out.println(MyMathUtil.pow(2, 3));

        System.out.println(Math.sqrt(16));
        System.out.println(Math.PI);
        System.out.println(Math.random());
        System.out.println(Math.max(20,30));
    }

}
