package com.careerit.jfs.cj.basics.cf.iplstats;

import java.util.List;

public class PlayerManager {

    public static void main(String[] args) {

        PlayerStatService service = new PlayerStatService();

        // Get the player of the given team name
        String teamName = "RCB";

        List<Player> players = service.getPlayersOf(teamName);
        System.out.println("The team :"+teamName+" has "+players.size()+" players");

        List<String> teamNames = service.getTeamNames();
        System.out.println("The teams are :"+teamNames);

        // Get the players of the given team name and role
        List<TeamAndAmount> teamAndAmounts = service.getTeamAndAmount();
        teamAndAmounts.forEach(TeamAndAmount::showTeamAndAmount);

        List<TeamAndAmountWithFormattedData> teamAndAmountWithFormattedData = service.getTeamAndAmountWithFormattedData();
        System.out.println(teamAndAmountWithFormattedData);
    }
}
