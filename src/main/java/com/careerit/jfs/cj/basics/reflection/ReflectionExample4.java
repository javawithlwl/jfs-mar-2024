package com.careerit.jfs.cj.basics.reflection;

public class ReflectionExample4 {
    public static void main(String[] args) {

        SuperPower superPower = new SuperPower();
        AuthorInfo authorInfo = superPower.getClass().getAnnotation(AuthorInfo.class);
        System.out.println(authorInfo.name());
        System.out.println(authorInfo.email());
    }
}
