package com.qawale;

public class Game {
    private final Board board;
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;

    public Game(int rows, int cols, Player player1, Player player2) {
        this.board = new Board(rows, cols);
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public boolean makeMove(int row, int col) {
        if (board.isMoveValid(row, col)) {
            board.placePiece(row, col, currentPlayer.getSymbol());
            switchPlayer();
            return true;
        }
        return false;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public void printBoard() {
        board.printBoard();
    }
}
