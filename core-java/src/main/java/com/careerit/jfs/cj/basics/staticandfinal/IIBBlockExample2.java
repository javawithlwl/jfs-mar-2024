package com.careerit.jfs.cj.basics.staticandfinal;

class Sample {
    int a;
    int b;

    static int count = 0;

    Sample() {

    }

    Sample(int a) {
        this.a = a;
    }

    Sample(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public void showValues() {
        System.out.println("A :" + a + " B :" + b);
    }

    static {
        System.out.println("Static block 1");
    }

    {
        count++;
        System.out.println("Object Created");
    }
}

public class IIBBlockExample2 {

    public static void main(String[] args) {
        System.out.println("Main method started");
        Sample obj = new Sample();
        Sample obj1 = new Sample(10);
        Sample obj2 = new Sample(10, 20);
        System.out.println(Sample.count);
    }
}
