package com.daelim.sfa.dto.player;

import lombok.Getter;

//  사각형 그래프
@Getter
public class GraphDto {

    private int tackles;

    private int dribbles;

    private int foulDrawn;

    private int foulCommitted;

    public void addGraph(int tackles, int dribbles, int foulDrawn, int foulCommitted){
        this.tackles = tackles;
        this.dribbles = dribbles;
        this.foulDrawn = foulDrawn;
        this.foulCommitted = foulCommitted;
    }

}
