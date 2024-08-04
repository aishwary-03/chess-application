package com.technogise.chess;

import com.technogise.chess.board.ChessBoard;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the 8*8 chess application");
        System.out.println("Supported pieces by the application: Pawn, King, Queen");
        System.out.println("Columns Range from A to H and Rows Range from 1 to 8");
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.suggestCells();
    }

}
