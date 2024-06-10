package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleAndAmountStatsDto;
import com.careerit.iplstats.dto.RoleCountStats;
import com.careerit.iplstats.dto.TeamAmountStats;

import java.util.List;

public interface IplStatsService {
  List<Player> addPlayers(List<Player> players);
  Player addPlayer(Player player);
  List<String> getTeamNames();
  List<TeamAmountStats> getTeamAmountStats();
  List<RoleCountStats> getRoleCountStats();

  List<Player> getPlayersByTeamName(String teamName);
  List<RoleAndAmountStatsDto> getRoleAndAmountStats(String teamName);
  List<RoleCountStats> getRoleCountStatsByTeamName(String teamName);
}
