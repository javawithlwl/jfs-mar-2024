package com.careerit.jfs.cj.basics.cf;
import lombok.*;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
class Mango {
    private String name;
    private String color;
    private int weight;

}

public class ListExample6 {

    public static void main(String[] args) {
        List<Mango> list = getMangoList();
        List<String> names = getMangoNames(list);
        System.out.println(names);
        List<Mango> yellowMangoes = getYellowMangoes(list);
        System.out.println(yellowMangoes);
        List<Mango> yellowMangoesWithWeightGreaterThan150 = getYellowMangoesWithWeightGreaterThan150(list);
        System.out.println(yellowMangoesWithWeightGreaterThan150);
        double totalWeight = getTotalWeight(list);
        System.out.println("Total weight of all mangoes :"+totalWeight);
    }

    // Get the mango names

    public static List<String> getMangoNames(List<Mango> list){
        /*List<String> namesList = new ArrayList<>();
        for(Mango mango:list) {
            namesList.add(mango.getName());
        }
        return namesList;*/
        return list.stream().map(Mango::getName).toList();
    }

    // Get all the mangoes which are yellow in color
    public static List<Mango> getYellowMangoes(List<Mango> list){
        return list.stream().filter(e -> e.getColor().equals("Yellow")).toList();
    }
    // Get all the mangoes which are yellow in color and weight is greater than 150

    public static List<Mango> getYellowMangoesWithWeightGreaterThan150(List<Mango> list){
        return list.stream().filter(e -> e.getColor().equals("Yellow") && e.getWeight() > 150).toList();
    }

    // Get total weight of all the mangoes

    public static double getTotalWeight(List<Mango> list){
        return list.stream().mapToDouble(Mango::getWeight).sum();
    }
    public static List<Mango> getMangoList() {
        return List.of(new Mango("Badami", "Yellow", 100),
                new Mango("Alphonso", "Yellow", 200),
                new Mango("Kesar", "Green", 150),
                new Mango("Raspuri", "Red", 120),
                new Mango("Totapuri", "Green", 180),
                new Mango("Dasheri", "Yellow", 130),
                new Mango("Langda", "Green", 140),
                new Mango("Neelam", "Red", 110),
                new Mango("Safeda", "Yellow", 160),
                new Mango("Himsagar", "Yellow", 170));
    }
}
