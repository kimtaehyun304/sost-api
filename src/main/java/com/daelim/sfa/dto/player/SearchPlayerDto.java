package com.daelim.sfa.dto.player;

import com.daelim.sfa.domain.player.Player;
import com.daelim.sfa.domain.player.PlayerStatistics;
import lombok.Getter;

import java.util.List;

@Getter
public class SearchPlayerDto {

    private PlayerInformationDto information;

    private List<PlayerStatisticsDto> statisticsList ;

    private TransferResult<List<PlayerTransferDto>> transfers ;

    public SearchPlayerDto(Player player, List<PlayerStatistics> playerStatisticsList,  TransferResult<List<PlayerTransferDto>> genericPlayerTransferDtos){
        information = new PlayerInformationDto(player);
        List<PlayerStatisticsDto> statisticsList = playerStatisticsList.stream().filter(ps -> ps.getRating() != 0).map(PlayerStatisticsDto::new).toList();
        this.statisticsList = statisticsList;
        transfers = genericPlayerTransferDtos;
    }

}
