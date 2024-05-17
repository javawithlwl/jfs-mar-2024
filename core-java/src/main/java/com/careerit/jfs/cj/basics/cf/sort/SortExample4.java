package com.careerit.jfs.cj.basics.cf.sort;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

record Player(String name, String country, double amount) {}
public class SortExample4 {

    public static void main(String[] args) {

        List<Player> list = List.of(new Player("Dhoni", "IND", 1000000), new Player("Kohli", "IND", 1000000),
                new Player("Rohit", "IND", 1500000), new Player("Smith", "AUS", 2500000),
                new Player("Warner", "AUS", 1800000), new Player("Root", "ENG", 1200000));

        list.stream().sorted(Comparator.comparing(Player::amount)
                .thenComparing(Comparator.comparing(Player::country)
                        .thenComparing(Comparator.comparing(Player::name).reversed())))
                .toList().forEach(System.out::println);
    }
}
