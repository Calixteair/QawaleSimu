package com.qawale;

import java.util.List;

public class Board {
    private Case[][] grid;

    public Board(int rows, int cols) {
        grid = new Case[rows][cols];
    }

    public boolean placeStone(int row, int col, Stone stone, Player player) {
        // Mocked method
        return true;
    }

    public boolean moveCurrentStone(int row, int col, Player player) {
        // Mocked method
        return true;
    }

    public Player checkWinningCondition() {
        // Mocked method
        return null;
    }
}
