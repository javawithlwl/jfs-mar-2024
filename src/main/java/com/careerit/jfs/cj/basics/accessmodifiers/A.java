package com.careerit.jfs.cj.basics.accessmodifiers;

public class A {

        private int pri_a = 10;
        int def_a = 20;
        protected int pro_a = 30;
        public int pub_a = 40;


        public void show() {
            System.out.println("Private :"+pri_a);
            System.out.println("Default :"+def_a);
            System.out.println("Protected :"+pro_a);
            System.out.println("Public :"+pub_a);
        }
}
