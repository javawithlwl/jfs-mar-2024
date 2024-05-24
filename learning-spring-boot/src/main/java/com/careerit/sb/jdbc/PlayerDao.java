package com.careerit.sb.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class PlayerDao {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final JdbcTemplate jdbcTemplate;

    // Get player of given team and role with amount greater than given amount
    public List<Player> getPlayers(String teamName,String role, double amount) {
      String sql = "SELECT id,name,team_name,role,amount FROM player WHERE team_name = :teamName AND role = :role AND amount > :amount";
      Map<String,Object> map = Map.of("teamName",teamName,"role",role,"amount",amount);
      return namedParameterJdbcTemplate.query(sql,map,new PlayerMapper());
    }

    public List<TeamAmountStats> getTeamAmountStats() {
        String sql = "SELECT team_name as teamName, sum(amount) as totalAmount FROM player GROUP BY team_name";
        return jdbcTemplate.query(sql,
            (rs,rn)-> new TeamAmountStats(rs.getString("teamName"),rs.getDouble("totalAmount")));
    }

}
