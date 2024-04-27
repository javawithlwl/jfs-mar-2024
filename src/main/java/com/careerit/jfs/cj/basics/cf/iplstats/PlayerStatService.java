package com.careerit.jfs.cj.basics.cf.iplstats;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlayerStatService {

    private List<Player> players;

    public PlayerStatService() {
         this.players = JsonReaderUtil.loadPlayers("/players.json");
    }


    // Get the players of the given team name

    public List<Player> getPlayersOf(String teamName) {
        return players.stream()
                .filter(p -> teamName.equals(p.getTeamName()))
                .toList();
    }

    // Get all the team names
    public List<String> getTeamNames() {
        /*List<String> teamNames = new ArrayList<>();
        for (Player player : players) {
            if (!teamNames.contains(player.getTeamName())) {
                teamNames.add(player.getTeamName());
            }
        }
        return teamNames;*/
        return players.stream()
                .map(Player::getTeamName)
                .distinct()
                .toList();
    }
    // Get the players of the given team name and role

    public List<Player> getPlayersOf(String teamName, String role) {
        return players.stream()
                .filter(p -> teamName.equals(p.getTeamName()) && role.equals(p.getRole()))
                .toList();
    }

    // Get the players of the given team name and role and amount is greater than given amount

    public List<Player> getPlayersOf(String teamName, String role, double amount) {
        return players.stream()
                .filter(p -> teamName.equals(p.getTeamName()) && role.equals(p.getRole()) && p.getAmount() > amount)
                .toList();
    }

    // Get the team name and total amount spent on the players

    public List<TeamAndAmount> getTeamAndAmount() {
        List<String> teamNames = getTeamNames();
        /*List<TeamAndAmount> teamAndAmounts = new ArrayList<>();

        for (String teamName : teamNames) {
            double totalAmount = players.stream()
                    .filter(p -> teamName.equals(p.getTeamName()))
                    .mapToDouble(Player::getAmount)
                    .sum();
            teamAndAmounts.add(new TeamAndAmount(teamName, totalAmount));
        }
        return teamAndAmounts;*/
        return teamNames.stream()
                .map(teamName -> new TeamAndAmount(teamName, players.stream()
                        .filter(p -> teamName.equals(p.getTeamName()))
                        .mapToDouble(Player::getAmount)
                        .sum()))
                .toList();
    }

    public List<TeamAndAmountWithFormattedData> getTeamAndAmountWithFormattedData(){
        List<String> teamNames = getTeamNames();
        return teamNames.stream()
                .map(teamName -> new TeamAndAmountWithFormattedData(teamName, formatAmount(players.stream()
                        .filter(p -> teamName.equals(p.getTeamName()))
                        .mapToDouble(Player::getAmount)
                        .sum())))
                .toList();
    }

    private String formatAmount(double amount) {
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        return formatter.format(amount);
    }

}
