package com.careerit.sc.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PlayerStatsDao {

    private final JdbcTemplate jdbcTemplate;

    public long getCount(){
      String query = "select count(*) from player";
      return jdbcTemplate.queryForObject(query, Long.class);
    }
}
