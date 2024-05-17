package com.careerit.jfs.cj.basics.day14;

import java.util.Objects;

class Product extends Object {
    private int pid;
    private String pname;
    private double price;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return pid == product.pid && Double.compare(price, product.price) == 0 && Objects.equals(pname, product.pname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, pname, price);
    }
}

public class OverrideExample {

    public static void main(String[] args) {

        Product p1 = new Product(1001, "Laptop", 45000);
        Product p2 = new Product(1001, "Laptop", 45000);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        System.out.println(p1.equals(p2));



    }
}
