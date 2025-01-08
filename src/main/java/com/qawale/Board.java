package com.qawale;

import java.util.Arrays;

public class Board {
    private String[][] grid;
    private final int rows;
    private final int cols;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new String[rows][cols];
        for (String[] row : grid) {
            Arrays.fill(row, ".");
        }
    }

    public boolean isMoveValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols && grid[row][col].equals(".");
    }

    public void placePiece(int row, int col, String player) {
        if (isMoveValid(row, col)) {
            grid[row][col] = player;
        } else {
            throw new IllegalArgumentException("Invalid move!");
        }
    }

    public String[][] getGrid() {
        return grid;
    }

    public void printBoard() {
        for (String[] row : grid) {
            System.out.println(String.join(" ", row));
        }
    }
}

