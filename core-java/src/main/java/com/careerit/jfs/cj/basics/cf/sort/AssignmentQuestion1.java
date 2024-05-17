package com.careerit.jfs.cj.basics.cf.sort;

import java.util.Comparator;
import java.util.List;

record Product(String name, double price, int quantity) {}
public class AssignmentQuestion1 {

    public static void main(String[] args) {

            Product p1 = new Product("Laptop", 45000, 10);
            Product p2 = new Product("Mobile", 15000, 20);
            Product p3 = new Product("Tablet", 10000, 15);
            Product p4 = new Product("Desktop", 35000, 5);
            Product p5 = new Product("Printer", 5000, 25);
            Product p6 = new Product("Mouse", 45000, 10);
            Product p7 = new Product("Keyboard", 15000, 20);

            // Create a list of products and sort the products based on the price in the descending order

            // Get the sorted list of products based on the price, quantity and name in the descending order

            // Get the sorted list of products based on the price, quantity and name in the ascending order

    }
}
