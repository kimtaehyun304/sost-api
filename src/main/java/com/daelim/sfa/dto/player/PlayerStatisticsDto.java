package com.daelim.sfa.dto.player;

import com.daelim.sfa.domain.player.PlayerStatistics;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.util.List;
@Getter
public class PlayerStatisticsDto {

    // 컨트롤러에서 필요해서 넣었습니다.
    @JsonIgnore
    private Long leagueId;

    private String leagueName;

    private int leagueSeason;

    private String position;

    private Double rating;

    private GraphDto graph = new GraphDto();

    private int passes;

    private int passesRanking;

    private int shots;

    private int shotsRanking;

    private int assists;

    private int assistsRanking;

    private int saves;

    private int savesRanking;

    private int goals;

    private int goalsRanking;

    private int goalsConceded;

    private int yellowCard;

    private int redCard;

    public PlayerStatisticsDto(PlayerStatistics playerStatistics){
        leagueId = playerStatistics.getLeague().getId();
        leagueName = playerStatistics.getLeague().getName();
        leagueSeason = playerStatistics.getSeason();
        position = playerStatistics.getPosition();
        rating = playerStatistics.getRating();
        graph.addGraph(playerStatistics.getTackles(), playerStatistics.getDribbles().getAttempts(), playerStatistics.getFouls().getDrawn(), playerStatistics.getFouls().getCommitted());
        passes = playerStatistics.getPasses().getTotal();
        shots = playerStatistics.getShots().getTotal();
        assists = playerStatistics.getGoals().getAssists();
        saves = playerStatistics.getGoals().getSaves();
        goals = playerStatistics.getGoals().getTotal();
        goalsConceded = playerStatistics.getGoals().getConceded();
        yellowCard = playerStatistics.getCards().getYellowTotal();
        redCard = playerStatistics.getCards().getRedTotal();
    }

    public void addStatRanking(int passesRanking, int shotsRanking, int assistsRanking, int savesRanking, int goalsRanking){
        this.passesRanking = passesRanking;
        this.shotsRanking = shotsRanking;
        this.assistsRanking = assistsRanking;
        this.savesRanking = savesRanking;
        this.goalsRanking = goalsRanking;
    }



}
