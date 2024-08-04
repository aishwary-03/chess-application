package com.technogise.chess.piece.impl;

import com.technogise.chess.domain.Cell;
import com.technogise.chess.piece.Piece;
import com.technogise.chess.validator.CellValidator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pawn implements Piece {

    @Override
    public List<Cell> getAllPossibleCells(Cell cell) {
        if (!CellValidator.isAValidCell(cell)) throw new IllegalArgumentException();
        List<Cell> possibleCells = new ArrayList<>();
        Cell possibleCell = new Cell(cell.column(), cell.row() + 1);
        if (CellValidator.isAValidCell(possibleCell)) {
            possibleCells.add(possibleCell);
        }
        return possibleCells;
    }
}
