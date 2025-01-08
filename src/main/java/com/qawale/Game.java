package com.qawale;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;

    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public boolean playStone(int row, int col, Player player, int type) {
        // Mocked method
        return true;
    }

    public boolean moveCurrentStone(int row, int col, Player player) {
        // Mocked method
        return true;
    }

    public Player checkWinner() {
        // Mocked method
        return null;
    }
}
