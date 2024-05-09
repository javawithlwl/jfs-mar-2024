package com.careerit.jfs.cj.basics.reflection.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {

            Class<Calculator> clazz = Calculator.class;

            try{
                Calculator obj = clazz.getDeclaredConstructor().newInstance();
                Method[] methods = clazz.getDeclaredMethods();
                for(Method method:methods){
                    if(method.isAnnotationPresent(TimeIt.class)){
                        long start = System.currentTimeMillis();
                        Object result = method.invoke(obj,100);
                        System.out.println("Result of method : "+method.getName()+" is : "+result);
                        long end = System.currentTimeMillis();
                        System.out.println("Time taken for method : "+method.getName()+" is : "+(end-start)+" ms");
                    }
                }
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
    }
}
