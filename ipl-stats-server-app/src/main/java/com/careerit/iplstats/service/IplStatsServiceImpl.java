package com.careerit.iplstats.service;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleAndAmountStatsDto;
import com.careerit.iplstats.dto.RoleCountStats;
import com.careerit.iplstats.dto.TeamAmountStats;
import com.careerit.iplstats.repo.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class IplStatsServiceImpl implements IplStatsService {

  private final PlayerRepository playerRepository;
  @Override
  public List<Player> addPlayers(List<Player> players) {
    log.info("Total players are : {}", players.size());
    List<Player> playerList = playerRepository.saveAll(players);
    log.info("Total players are saved : {}", playerList.size());
    return playerList;
  }

  @Override
  public Player addPlayer(Player player) {
    log.info("Player name : {}", player.getName());
    player = playerRepository.save(player);
    log.info("Player saved with id : {}", player.getId());
    return player;
  }

  @Override
  public List<String> getTeamNames() {
    List<String> teamNames = playerRepository.findDistinctTeamName();
    log.info("Total team names are : {}", teamNames.size());
    return teamNames;
  }

  @Override
  public List<TeamAmountStats> getTeamAmountStats() {
    return playerRepository.findTeamAmountStats();
  }

  @Override
  public List<RoleCountStats> getRoleCountStats() {
    return playerRepository.findRoleCountStats();
  }

  @Override
  public List<Player> getPlayersByTeamName(String teamName) {
    return playerRepository.findByTeamName(teamName);
  }

  @Override
  public List<RoleAndAmountStatsDto> getRoleAndAmountStats(String teamName) {
    return playerRepository.findRoleAndAmountStatsByTeamName(teamName);
  }

  @Override
  public List<RoleCountStats> getRoleCountStatsByTeamName(String teamName) {
    return playerRepository.findRoleCountStatsByTeamName(teamName);
  }
}
