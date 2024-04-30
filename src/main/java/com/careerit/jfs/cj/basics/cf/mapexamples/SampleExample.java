package com.careerit.jfs.cj.basics.cf.mapexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

record Player(int id, String name, double salary) {
}
record PlayerMap(int id, String name){

}
public class SampleExample {

    public static void main(String[] args) {
        String data = "1001-Rajesh-45000, 1002-Suresh-25000, 1001-Rajesh-45000, 1003-Suresh-15000, 1002-Suresh-25000";
        List<Player> players = new ArrayList<>();
        for(String str: data.split(",")){
            String[] arr = str.trim().split("-");
            for(String s: arr){
                Integer id = Integer.parseInt(arr[0]);
                String name = arr[1];
                double salary = Double.parseDouble(arr[2]);
                Player player = new Player(id, name, salary);
                players.add(player);
            }
        }

        Set<PlayerMap> set = new HashSet<>();
        for(Player player: players){
            PlayerMap playerMap = new PlayerMap(player.id(), player.name());
            set.add(playerMap);
        }

        for(PlayerMap playerMap: set){
            System.out.println(playerMap.id());
            System.out.println(playerMap.name());
        }

    }
}
