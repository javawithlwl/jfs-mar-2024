package com.careerit.jfs.cj.basics.day12;

public class ProductManager {

    public static void main(String[] args) {

        Product p1 = new Product(1001, "Laptop", 45000, "Dell", 10);
        Product p2 = new Product(1002, "Mobile", 25000, "OnePlus", 5);
        Product p3 = new Product(1003, "Headphones", 2500, "Boat", 15);
        Product p4 = new Product(1004, "Mouse", 500, "Logitech", 20);
        Product p5 = new Product(1005, "Keyboard", 1000, "Dell", 10);
        Product p6 = new Product(1006, "Monitor", 15000, "LG", 10);
        Product p7 = new Product(1007, "Printer", 8000, "HP", 10);
        Product p10 = new Product(1008, "Scanner", 5000, "HP", 10);
        Product p8 = new Product(1009, "PenDrive", 500, "Sandisk", 10);
        Product p9 = new Product(1010, "SSD", 5000, "HP", 10);

        Product[] products = new Product[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};

        for(Product product: products) {
           product.showInfo();
            System.out.println("--------------------");
        }


    }
}
