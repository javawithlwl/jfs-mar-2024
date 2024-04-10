package com.careerit.jfs.cj.basics.day12;

public class Product {

    private int pid;
    private String pname;
    private double price;
    private String brand;
    private double discount;
    private boolean available;

    public Product(int pid, String pname, double price, String brand, double discount) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.brand = brand;
        this.discount = discount;
    }

    public void showInfo() {
        System.out.println("Product Id :" + pid);
        System.out.println("Product Name :" + pname);
        System.out.println("Brand :" + brand);
        System.out.println("Price :" + price);
        System.out.println("Discount :" + discount);
        System.out.println("Discounted Price :" + getDiscountedPrice());
    }

    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
