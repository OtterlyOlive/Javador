package com.company;

import java.util.HashMap;

/**
 * Created by eax on 16/02/16.
 */
public class Board {
    private HashMap board = new HashMap();

    public Board(HashMap board) {
        this.board = board;
    }

    public HashMap getBoard() {
        return board;
    }
}
