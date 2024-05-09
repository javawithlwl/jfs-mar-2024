package com.careerit.jfs.cj.basics.generics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyContainer<T>{
    Object[] arr = new Object[10];
    int index = 0;
    public void add(T t){
        arr[index++] = t;
    }
    public T get(int index){
        return (T)arr[index];
    }
    public void print(){
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
}

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class Invoice implements Comparable<Invoice>{
    private String invoiceNo;

    @Override
    public int compareTo(Invoice o) {
        return this.invoiceNo.compareTo(o.invoiceNo);
    }
}

@Data
class MonthlyInvoice extends Invoice{

}

class QuarterlyInvoice{

}

public class GenericsExample6 {

    public static void main(String[] args) {

        MyContainer<String> container = new MyContainer<>();
        container.add("Hello");
        container.add("Java");
        container.add("Python");
        System.out.println(container.get(0));
        container.print();

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("Z");
        list.add("B");
        sort(list);
        System.out.println(list);

        List<Invoice> invoices = new ArrayList<>();
        invoices.add(MonthlyInvoice.builder().invoiceNo("CUST-1001").build());
        invoices.add(MonthlyInvoice.builder().invoiceNo("CUST-1008").build());
        invoices.add(MonthlyInvoice.builder().invoiceNo("CUST-1003").build());

        sort(invoices);
        System.out.println(invoices);

    }
    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        list.sort(null);
    }

}
