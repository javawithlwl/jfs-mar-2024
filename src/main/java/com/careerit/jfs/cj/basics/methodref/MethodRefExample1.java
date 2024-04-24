package com.careerit.jfs.cj.basics.methodref;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefExample1 {

    public static void main(String[] args) {

        List<String> userNames = List.of("Krish", "Manoj", "John", "Smith", "Anand", "Suresh");

        userNames.forEach(MethodRefExample1::print);

        MethodRefExample1 obj = new MethodRefExample1();

        userNames.forEach(obj::print1);

        List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);


    }

    public static void print(String name) {
        System.out.println(name);
    }

    public void print1(String name) {
        System.out.println(name);
    }

}
