package com.careerit.jfs.cj.basics.reflection;

import java.lang.reflect.Method;

public class ReflectionsExample1 {

    public static void main(String[] args) {
        String name = "Krish";

        Class<?> clazz = name.getClass();
        System.out.println(clazz.getName());

        // Get all the methods of the class

        Method[] methods = clazz.getDeclaredMethods();

        for(Method method:methods) {
            String n = method.getName();
            Class<?> retType = method.getReturnType();
            System.out.println(n+" : "+retType.getName());
        }
        Class<?>[] arr = clazz.getInterfaces();
        for(Class<?> c:arr) {
            System.out.println(c.getName());
        }
    }
}
