package com.careerit.iplstats.repo;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.dto.RoleAndAmountStatsDto;
import com.careerit.iplstats.dto.RoleCountStats;
import com.careerit.iplstats.dto.TeamAmountStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface PlayerRepository extends JpaRepository<Player, UUID> {

    @Query("select distinct p.teamName from Player p")
    List<String> findDistinctTeamName();

    @Query("""
            select new com.careerit.iplstats.dto.TeamAmountStats(p.teamName, sum(p.amount)) from Player p
            group by p.teamName order by sum(p.amount)
            """)
    List<TeamAmountStats> findTeamAmountStats();


    @Query("""
            select new com.careerit.iplstats.dto.RoleCountStats(p.role, count(p.role)) from Player p
            group by p.role order by count(p.role)
            """)
    List<RoleCountStats> findRoleCountStats();


    @Query("select p from Player p where lower(p.teamName) = lower(:teamName)")
    List<Player> findByTeamName(@Param("teamName") String teamName);

    @Query("""
            select new com.careerit.iplstats.dto.RoleCountStats(p.role, count(p.role)) from Player p
            where lower(p.teamName) = lower(:teamName)
            group by p.role order by count(p.role)
            """)
    List<RoleCountStats> findRoleCountStatsByTeamName(String teamName);

    @Query("""
            select new com.careerit.iplstats.dto.RoleAndAmountStatsDto(p.role, sum(p.amount)) from Player p
            where lower(p.teamName) = lower(:teamName)
            group by p.role order by sum(p.amount)
            """)
    List<RoleAndAmountStatsDto> findRoleAndAmountStatsByTeamName(String teamName);
}
