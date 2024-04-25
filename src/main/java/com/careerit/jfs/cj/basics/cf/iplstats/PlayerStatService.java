package com.careerit.jfs.cj.basics.cf.iplstats;

import java.util.List;

public class PlayerStatService {

    private List<Player> players;

    public PlayerStatService() {
        this.players = JsonReaderUtil.loadPlayers("/players.json");
    }



    // Get the players of the given team name

    public List<Player> getPlayersOf(String teamName){
        return null;
    }

    // Get all the team names
    public List<String> getTeamNames(){
        return null;
    }

    // Get the players of the given team name and role

    public List<Player> getPlayersOf(String teamName,String role){
        return null;
    }

    // Get the players of the given team name and role and amount is greater than given amount

    public List<Player> getPlayersOf(String teamName,String role,double amount){
        return null;
    }

    // Get the team name and total amount spent on the players

    public List<TeamAndAmount> getTeamAndAmount(){
        return null;
    }
}
