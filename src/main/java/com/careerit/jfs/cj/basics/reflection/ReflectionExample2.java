package com.careerit.jfs.cj.basics.reflection;

import java.lang.reflect.InvocationTargetException;

public class ReflectionExample2 {

    public static void main(String[] args) {

            String className = "com.careerit.jfs.cj.basics.reflection.Account";

        try {
            Class<?> clazz = Class.forName(className);
            Object ret = clazz.getDeclaredConstructor().newInstance();
            Account account = (Account) ret;
            account.setAccNum("ACC123");
            account.setName("Krish");
            account.setBalance(10000);
            System.out.println(account);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

}