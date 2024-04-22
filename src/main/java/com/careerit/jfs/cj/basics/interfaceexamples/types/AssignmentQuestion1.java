package com.careerit.jfs.cj.basics.interfaceexamples.types;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class  Mango{
    private String name;
    private double price;
    private String color;

    public Mango(String name,double price,String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mango{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
class MangoService{

    private List<Mango> mangos;

    MangoService(){
        mangos = List.of(new Mango("Alphonso", 100, "Yellow"),
                new Mango("Kesar", 80, "Green"),
                new Mango("Raspuri", 120, "Red"),
                new Mango("Totapuri", 90, "Yellow"),
                new Mango("Dasheri", 90, "Green"),
                new Mango("Langda", 70, "Green"),
                new Mango("Neelam", 50, "Yellow"),
                new Mango("Safeda", 40, "Green"),
                new Mango("Himsagar", 110, "Yellow"),
                new Mango("Chausa", 130, "Green"));
    }

    public List<Mango> findMangoes(Predicate<Mango> predicate){
        List<Mango> resultList = new ArrayList<>();
        for(Mango mango:mangos){
            if(predicate.test(mango)){
                resultList.add(mango);
            }
        }
        return resultList;
    }

}
public class AssignmentQuestion1 {

    public static void main(String[] args) {

        MangoService service = new MangoService();
        // Get all the green mangoes
        Predicate<Mango> greenMangoPredicate = (mango) ->mango.getColor().equals("Green");
        List<Mango> greenMangoes = service.findMangoes(greenMangoPredicate);
        System.out.println(greenMangoes);
        // Get all the yellow mangoes with price greater than 80
        // Get all the mangoes with price greater than 100 and color is green or yellow


    }
}
