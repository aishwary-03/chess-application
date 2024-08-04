package com.technogise.chess.board;

import com.technogise.chess.domain.Cell;
import com.technogise.chess.factory.PieceFactory;
import com.technogise.chess.piece.Piece;
import com.technogise.chess.validator.CellValidator;
import com.technogise.chess.validator.PieceValidator;

import java.util.List;
import java.util.Scanner;

public class ChessBoard {

    private final Scanner scanner;

    public ChessBoard() {
        scanner = new Scanner(System.in);
    }

    public void suggestCells() {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Please enter the input like: Pawn, A1" );
            String userInput = scanner.nextLine();
            while (!isAValidUserInput(userInput)) {
                System.out.println("Invalid Input!!");
                System.out.println("Please enter the input like: Pawn, A1" );
                userInput = scanner.nextLine();
            }
            String pieceInput = userInput.split(",")[0].trim().toUpperCase();
            String cellInput = userInput.split(",")[1].trim().toUpperCase();
            Cell cell = getCell(cellInput);
            Piece piece = PieceFactory.getPiece(pieceInput);
            List<Cell> allCells = piece.getAllPossibleCells(cell);
            if (allCells.isEmpty()) {
                System.out.println("No possible cells found!");
            } else {
                allCells.forEach(System.out::print);
            }
            System.out.println("\nDo you wish to continue? (y/n)");
            String answer = scanner.nextLine();
            isContinue = answer.equalsIgnoreCase("y");
        }
    }

    private boolean isAValidUserInput(String userInput) {
        if (!userInput.contains(",") || userInput.split(",").length != 2) return false;
        if (!isAValidPiece(userInput)) return false;
        String cellInput = userInput.split(",")[1].trim().toUpperCase();
        if (!isAValidCell(cellInput)) return false;
        Cell cell = getCell(cellInput);
        return CellValidator.isAValidCell(cell);
    }

    private static Cell getCell(String cellInput) {
        char cellColumn = cellInput.charAt(0);
        int cellRow = Integer.parseInt(cellInput.substring(1));
        return new Cell(cellColumn, cellRow);
    }

    private static boolean isAValidCell(String cellInput) {
        if (cellInput.length() != 2) return false;
        if (!Character.isLetter(cellInput.charAt(0))) return false;
        return Character.isDigit(cellInput.charAt(1));
    }

    private static boolean isAValidPiece(String userInput) {
        String pieceInput = userInput.split(",")[0].trim().toUpperCase();
        return PieceValidator.isAValidPiece(pieceInput);
    }

}
