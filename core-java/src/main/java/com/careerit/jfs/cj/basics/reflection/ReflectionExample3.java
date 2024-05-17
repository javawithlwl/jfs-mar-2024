package com.careerit.jfs.cj.basics.reflection;

import java.util.Map;

public class ReflectionExample3 {

    public static void main(String[] args) {

        Map<String,Object> map1 = Map.of("name","Krish","empno","EMP123","salary",10000.0);
        Map<String,Object> map2 = Map.of("accNum","ACC123","name","Krish","balance",10000.0);

        Employee emp = ReflectionUtil.getInstance(map1, Employee.class);
        Account acc = ReflectionUtil.getInstance(map2, Account.class);

        System.out.println(emp);
        System.out.println(acc);
    }
}
