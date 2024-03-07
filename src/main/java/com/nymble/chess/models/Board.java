package com.nymble.chess.models;

import lombok.Getter;

import java.util.List;

@Getter
public class Board {
    List<Cell> cells;
    public Board() {
        this.reset();
    }
    public void reset() {
        for(int x=0; x<8; x++){
            for(int y=0; y<8; y++){
//                For 1st row(x=0) and 2nd row(x=1) we need to add the White Warriors and for 7th and 8th Row we need to add the Black Warriors
                cells.add(new Cell(x,y));
            }
        }

    }
}
