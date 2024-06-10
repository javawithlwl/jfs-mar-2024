package com.careerit.iplstats.web;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleAndAmountStatsDto;
import com.careerit.iplstats.dto.RoleCountStats;
import com.careerit.iplstats.dto.TeamAmountStats;
import com.careerit.iplstats.service.IplStatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ipl-stats")
@RequiredArgsConstructor
public class IplStatsController {

    private final IplStatsService iplStatsService;

    @PostMapping("/players")
    public ResponseEntity<List<Player>> addPlayers(@RequestBody  List<Player> players) {
        List<Player> playerList = iplStatsService.addPlayers(players);
        return ResponseEntity.ok(playerList);
    }

    @PostMapping("/player")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player player1 = iplStatsService.addPlayer(player);
        return ResponseEntity.ok(player1);
    }

    @GetMapping("/team-names")
    public ResponseEntity<List<String>> getTeamNames() {
        List<String> teamNames = iplStatsService.getTeamNames();
        return ResponseEntity.ok(teamNames);
    }

    @GetMapping("/team-amount-stats")
    public ResponseEntity<List<TeamAmountStats>> getTeamAmountStats() {
        List<TeamAmountStats> teamAmountStats = iplStatsService.getTeamAmountStats();
        return ResponseEntity.ok(teamAmountStats);
    }

    @GetMapping("/role-count-stats")
    public ResponseEntity<List<RoleCountStats>> getRoleCountStats() {
        List<RoleCountStats> roleCountStats = iplStatsService.getRoleCountStats();
        return ResponseEntity.ok(roleCountStats);
    }

    @GetMapping("/players/{teamName}")
    public ResponseEntity<List<Player>> getPlayersByTeamName(@PathVariable String teamName) {
        List<Player> players = iplStatsService.getPlayersByTeamName(teamName);
        return ResponseEntity.ok(players);
    }

    @GetMapping("/role-count-stats/{teamName}")
    public ResponseEntity<List<RoleCountStats>> getRoleCountStatsByTeamName(@PathVariable String teamName) {
        List<RoleCountStats> roleCountStats = iplStatsService.getRoleCountStatsByTeamName(teamName);
        return ResponseEntity.ok(roleCountStats);
    }

    @GetMapping("/role-amount-stats/{teamName}")
    public ResponseEntity<List<RoleAndAmountStatsDto>> getRoleAndAmountStatsByTeamName(@PathVariable String teamName) {
        List<RoleAndAmountStatsDto> roleCountStats = iplStatsService.getRoleAndAmountStats(teamName);
        return ResponseEntity.ok(roleCountStats);
    }

}
