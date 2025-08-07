package com.daelim.sfa.dto.team;

import com.daelim.sfa.domain.player.Player;
import com.daelim.sfa.domain.team.Team;
import com.daelim.sfa.dto.player.PlayerInformationDto;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Getter
@Slf4j
public class SquadDto {

    private TeamDto team;

//    private List<PlayerInformationDto> players;

    private List<PlayerInformationDto> attackerList = new ArrayList<>();

    private List<PlayerInformationDto> defenderList = new ArrayList<>();;

    private List<PlayerInformationDto> midfielderList = new ArrayList<>();;

    private List<PlayerInformationDto> goalkeeperList = new ArrayList<>();;

    @Builder
    public SquadDto(Team team, List<Player> players) {
        this.team = new TeamDto(team);

        for (Player player : players) {
            PlayerInformationDto playerInformationDto = new PlayerInformationDto(player);
            switch (player.getPosition()) {
                case Attacker:
                    attackerList.add(playerInformationDto);
                    break;
                case Defender:
                    defenderList.add(playerInformationDto);
                    break;
                case Midfielder:
                    midfielderList.add(playerInformationDto);
                    break;
                case Goalkeeper:
                    goalkeeperList.add(playerInformationDto);
                    break;
                default:
                    log.error("포지션 분류 실패");
            }

        }
    }



}
