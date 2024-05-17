package com.careerit.jfs.cj.basics.cf;

import java.util.ArrayList;
import java.util.List;

class Person{
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Id :"+id+" Name :"+name+" Age :"+age);
    }

}

public class ListExample4 {

    public static void main(String[] args) {
        String data = "1001-Krish-23,1002-Manoj-24,1003-Charan-25,1004-Krish-23,1005-Ramesh-24,1006-Suresh-25,1007-Manoj-24";
        List<Person> personList = new ArrayList<>();
        // 1001-Krish-23 -> convert into Person object and add into personList

        // display each person details by calling show method
    }
}
