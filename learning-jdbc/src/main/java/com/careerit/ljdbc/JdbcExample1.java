package com.careerit.ljdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

record Player(int id, String name, String teamName, String role, double amount) {
}
public class JdbcExample1 {

    public static void main(String[] args) {
       List<Player> players = getPlayers();
       showAllPlayers(players);
    }

    private static List<Player> getPlayers() {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        final String GET_PLAYERS = "select id,name,team_name,role,amount from player";
        List<Player> players = new ArrayList<>();
        try{
            con = ConnectionUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(GET_PLAYERS);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String teamName = rs.getString("team_name");
                String role = rs.getString("role");
                double amount = rs.getDouble("amount");
                players.add(new Player(id, name, teamName, role, amount));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ConnectionUtil.close(con, st, rs);
        }
        return players;
    }
    private static void showAllPlayers(List<Player> players) {
        System.out.println("-".repeat(100));
        for(Player player:players){
            System.out.println(String.format("%-5d %-30s %-20s %-20s %10.2f", player.id(), player.name(), player.teamName(), player.role(), player.amount()));
        }

    }
}
