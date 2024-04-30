package com.careerit.jfs.cj.basics.cf.mapexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample1 {

    public static void main(String[] args) {

        Map<Integer,String> playerMap = new HashMap<>();
        playerMap.put(1001, "Sachin");
        playerMap.put(1002, "Dhoni");
        playerMap.put(1003, "Virat");
        playerMap.put(1004, "Rohit");
        playerMap.put(1001, "Sachin Tendulkar");

        System.out.println(playerMap);

        System.out.println(playerMap.get(1001));
        System.out.println(playerMap.get(1005));

        Set<Integer> keys =  playerMap.keySet();
        Collection<String> values = playerMap.values();

        for(Integer key: keys) {
            System.out.println(key+" : "+playerMap.get(key));
        }

        Set<Map.Entry<Integer,String>> entries = playerMap.entrySet();

        for(Map.Entry<Integer,String> entry: entries) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        playerMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
