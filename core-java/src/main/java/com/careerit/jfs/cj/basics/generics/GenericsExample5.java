package com.careerit.jfs.cj.basics.generics;

import java.util.List;

class Printer{
    void print(String data){
        System.out.println(data);
    }
}
class SonyPrinter extends Printer{
    void print(String data){
        System.out.println("Sony Printer: "+data);
    }
}
class HPPrinter extends Printer{
    void print(String data){
        System.out.println("HP Printer: "+data);
    }
}

public class GenericsExample5 {

    public static void main(String[] args) {
        printData(List.of(new SonyPrinter(),new HPPrinter()), "Hello");
    }

    public static void printData(List<? extends Printer> printers, String data){
        for(Printer printer:printers){
            printer.print(data);
        }
    }

}
