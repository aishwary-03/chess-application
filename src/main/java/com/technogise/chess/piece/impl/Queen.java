package com.technogise.chess.piece.impl;

import com.technogise.chess.domain.Cell;
import com.technogise.chess.piece.Piece;
import com.technogise.chess.validator.CellValidator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Queen implements Piece {

    @Override
    public List<Cell> getAllPossibleCells(Cell cell) {
        if (!CellValidator.isAValidCell(cell)) throw new IllegalArgumentException();
        List<Cell> possibleCells = new ArrayList<>();
        possibleCells.addAll(getAllRookCells(cell));
        possibleCells.addAll(getAllBishopCells(cell));
        return possibleCells;
    }

    private List<Cell> getAllBishopCells(Cell cell) {
        List<Cell> possibleCells = new ArrayList<>();
        possibleCells.addAll(getDiagonalCells(cell, 1, -1));
        possibleCells.addAll(getDiagonalCells(cell, 1, 1));
        possibleCells.addAll(getDiagonalCells(cell, -1, -1));
        possibleCells.addAll(getDiagonalCells(cell, -1, 1));
        return possibleCells;
    }

    private List<Cell> getDiagonalCells(Cell cell, int rowIndex, int columnIndex) {
        List<Cell> possibleCells = new ArrayList<>();
        int row = cell.row() + rowIndex;
        int column = cell.column() + columnIndex;
        Cell possibleCell = new Cell((char) column, row);
        while (CellValidator.isAValidCell(possibleCell)) {
            possibleCells.add(possibleCell);
            column = column + columnIndex;
            row += rowIndex;
            possibleCell = new Cell((char) column, row);
        }
        return possibleCells;
    }

    private List<Cell> getAllRookCells(Cell cell) {
        List<Cell> possibleCells = new ArrayList<>();
        for (int counter = 0; counter < 8; counter++) {
            Cell possibleCell = new Cell(cell.column(), counter + 1);
            if (CellValidator.isAValidCell(possibleCell) && !cell.equals(possibleCell)) {
                possibleCells.add(possibleCell);
            }
            Cell anotherPossibleCell = new Cell((char) ('A' + counter), cell.row());
            if (CellValidator.isAValidCell(anotherPossibleCell) && !cell.equals(anotherPossibleCell)) {
                possibleCells.add(anotherPossibleCell);
            }
        }
        return possibleCells;
    }
}
