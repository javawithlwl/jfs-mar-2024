package com.careerit.jfs.cj.basics.cf.setexample;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Product{
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
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                '}';
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
public class SetExample2 {

    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();
        Product p1 = new Product(1001,"Laptop",45000);
        Product p2 = new Product(1002,"Mobile",25000);
        Product p3 = new Product(1001,"Laptop",45000);
        Product p4 = new Product(1003,"Tablet",15000);
        Product p5 = new Product(1002,"Mobile",25000);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        System.out.println(set.size());


    }

}
