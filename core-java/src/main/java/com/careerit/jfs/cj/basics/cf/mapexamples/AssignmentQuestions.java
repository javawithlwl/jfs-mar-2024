package com.careerit.jfs.cj.basics.cf.mapexamples;

import java.util.List;

record Product(int id, String name, double price) {
}
public class AssignmentQuestions {

    public static void main(String[] args) {

        List<Product> products = getProducts();
        // Create map of products with id as key and product as value

        // Get all keys from the map and display them

        // Get all the key,value pairs from the map and display them



    }

    public static List<Product> getProducts(){
        return List.of(
                new Product(1001, "Laptop", 45000),
                new Product(1002, "Mobile", 25000),
                new Product(1003, "Tablet", 15000),
                new Product(1004, "Desktop", 35000),
                new Product(1005, "Smart Watch", 5000),
                new Product(1006, "Ear Buds", 2000),
                new Product(1007, "Head Phones", 3000),
                new Product(1008, "Power Bank", 1500),
                new Product(1009, "Charger", 1000),
                new Product(1010, "Mouse", 500)
        );
    }

}
