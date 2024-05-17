package com.careerit.jfs.cj.basics.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@Getter
@Setter
@AllArgsConstructor
@ToString
class Product{
    private int pid;
    private String pname;
    private double price;

}
public class GenericExample2 {

  /*  public static List<String> covert(String[] arr){
        return Stream.of(arr).toList();
    }
    public static List<Integer> covert(Integer[] arr){
        return Stream.of(arr).toList();
    }

    public static List<Double> covert(Double[] arr){
        return Stream.of(arr).toList();
    }

    public static List<Product> covert(Product[] arr){
        return Stream.of(arr).toList();
    }*/

    public static <T> List<T> covert(T[] arr){
        return Stream.of(arr).toList();
    }

    public static void main(String[] args) {

            String[] arr = {"Hello","Java","Python"};
            List<String> list = covert(arr);

            Integer[] arr1 = {10,20,30,40,50};
            List<Integer> list1 = covert(arr1);

            Double[] arr2 = {10.5,20.5,30.5,40.5,50.5};
            List<Double> list2 = covert(arr2);

            Product[] arr3 = {new Product(1001,"Laptop",45000),new Product(1002,"Mobile",25000)};
            List<Product> list3 = covert(arr3);

            System.out.println(list);
            System.out.println(list1);
            System.out.println(list2);
            System.out.println(list3);
    }
}
