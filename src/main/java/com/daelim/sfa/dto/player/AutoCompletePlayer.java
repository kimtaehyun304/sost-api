package com.daelim.sfa.dto.player;

import com.daelim.sfa.domain.player.Player;
import lombok.Getter;

@Getter
public class AutoCompletePlayer {

    private Long id;
    private String photo;
    private String name;

    public AutoCompletePlayer(Player player) {
        id = player.getId();
        photo = player.getPhoto();
        StringBuilder stringBuilder = new StringBuilder();
        name = stringBuilder.append(player.getFirstName()).append(" ").append(player.getLastName()).toString();
    }
}
