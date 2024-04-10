package com.careerit.jfs.cj.basics.accessmodifiers.one;

import com.careerit.jfs.cj.basics.accessmodifiers.A;

public class E {

    A obj = new A();

    public void show() {
        //System.out.println("Private :"+obj.pri_a);
        // System.out.println("Default :"+obj.def_a);
        //System.out.println("Protected :"+obj.pro_a);
        System.out.println("Public :" + obj.pub_a);
    }
}
