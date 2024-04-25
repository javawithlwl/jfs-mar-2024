package com.careerit.jfs.cj.basics.cf.iplstats;

import java.util.List;

public class PlayerManager {

    public static void main(String[] args) {

        PlayerStatService service = new PlayerStatService();

        // Get the player of the given team name
        String teamName = "RCB";

        List<Player> players = service.getPlayersOf(teamName);
        System.out.println("The team :"+teamName+" has "+players.size()+" players");



    }
}
