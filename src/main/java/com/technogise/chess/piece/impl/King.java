package com.technogise.chess.piece.impl;

import com.technogise.chess.domain.Cell;
import com.technogise.chess.piece.Piece;
import com.technogise.chess.validator.CellValidator;

import java.util.*;

public class King implements Piece {

    @Override
    public List<Cell> getAllPossibleCells(Cell cell) {
        if (!CellValidator.isAValidCell(cell)) throw new IllegalArgumentException();
        List<Cell> possibleCells = new ArrayList<>();
        getAllDirections().forEach(direction -> {
            Cell possibleCell = getPossibleCell(cell, direction);
            if (CellValidator.isAValidCell(possibleCell)) {
                possibleCells.add(possibleCell);
            }
        });
        return possibleCells;
    }

    private static Cell getPossibleCell(Cell cell, List<Integer> direction) {
        char possibleColumn = (char) (cell.column() + direction.getFirst());
        int possibleRow = cell.row() + direction.getLast();
        return new Cell(possibleColumn, possibleRow);
    }

    private List<List<Integer>> getAllDirections() {
        List<List<Integer>> directions = new ArrayList<>();
        directions.add(List.of(-1, -1));
        directions.add(List.of(-1, 0));
        directions.add(List.of(-1, 1));
        directions.add(List.of(0, -1));
        directions.add(List.of(0, 1));
        directions.add(List.of(1, -1));
        directions.add(List.of(1, 0));
        directions.add(List.of(1, 1));
        return directions;
    }
}
