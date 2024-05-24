package com.careerit.sb.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerMapper implements RowMapper<Player> {
  @Override
  public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
    Player player = new Player();
    player.setId(rs.getLong("id"));
    player.setName(rs.getString("name"));
    player.setTeamName(rs.getString("team_name"));
    player.setRole(rs.getString("role"));
    player.setAmount(rs.getDouble("amount"));
    return player;
  }
}
