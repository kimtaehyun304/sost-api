package com.daelim.sfa.dto.team;

import com.daelim.sfa.domain.team.Team;
import lombok.Getter;

@Getter
public class AutoCompleteTeam {

    private Long id;
    private String logo;
    private String name;

    public AutoCompleteTeam(Team team) {
        id = team.getId();
        logo = team.getLogo();
        name = team.getName();
    }
}
