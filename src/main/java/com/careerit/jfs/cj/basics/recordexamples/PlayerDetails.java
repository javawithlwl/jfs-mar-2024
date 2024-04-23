package com.careerit.jfs.cj.basics.recordexamples;



record Player(String name, String team, String role, double amount) { }

record PlayerBasicDetails(String name, String team) {}
public class PlayerDetails {

    public static void main(String[] args) {

        Player[] players = new Player[]{
                new Player("Dhoni", "CSK", "WK", 1500000),
                new Player("Kohli", "RCB", "Batsman", 2000000),
                new Player("Rohit", "MI", "Batsman", 1800000),
                new Player("Warner", "SRH", "Batsman", 1600000),
                new Player("Rashid", "SRH", "Bowler", 1500000),
                new Player("Bumrah", "MI", "Bowler", 2000000),
                new Player("ABD", "RCB", "Batsman", 1800000)
        };

        // Collect name,team name of all the players

        PlayerBasicDetails[] playerBasicDetails = new PlayerBasicDetails[players.length];

        for(int i=0;i<players.length;i++){
            playerBasicDetails[i] = new PlayerBasicDetails(players[i].name(), players[i].team());
        }

        // Display the player basic details

        for(PlayerBasicDetails player:playerBasicDetails){
            System.out.println(player);
        }

    }
}
