package com.qawale;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Stone currentStone;
    private Player currentPlayer;
    private AI ailogique;

    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.ailogique = new AI();
    }

    public boolean playStone(int row, int col, Player player, int type) {
        // Mocked method
        return true;
    }

    public boolean moveCurrentStone(int row, int col, Player player) {
        // Mocked method
        return true;
    }

    public boolean isPat(){
        return true;
    }

    public Stone getCurrentStone() {
        return currentStone;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public AI getAI(){
        return ailogique;
    }

}
