package com.technogise.chess.piece.impl;

import com.technogise.chess.domain.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PawnTest {

    private Pawn pawn;

    @BeforeEach
    public void setUp() {
        pawn = new Pawn();
    }

    @Test
    public void shouldReturnOnlyOneCellWhenThePawnCanMoveForward() {
        Cell inputCell = new Cell('G', 1);

        List<Cell> possibleCells = pawn.getAllPossibleCells(inputCell);

        assertEquals(1, possibleCells.size());
    }

    @Test
    public void shouldReturnNoCellsWhenThePawnCannotMoveForward() {
        Cell inputCell = new Cell('G', 8);

        List<Cell> possibleCells = pawn.getAllPossibleCells(inputCell);

        assertEquals(0, possibleCells.size());
    }

    @Test
    public void shouldReturnTheNextRowWhenThePawnCanMoveForward() {
        Cell inputCell = new Cell('G', 1);

        List<Cell> possibleCells = pawn.getAllPossibleCells(inputCell);

        Cell cell = possibleCells.getFirst();
        assertEquals(2, cell.row());
    }

    @Test
    public void shouldReturnTheSameColumnWhenThePawnCanMoveForward() {
        Cell inputCell = new Cell('G', 1);

        List<Cell> possibleCells = pawn.getAllPossibleCells(inputCell);

        Cell cell = possibleCells.getFirst();
        assertEquals('G', cell.column());
    }

    @Test
    public void shouldThrowAnExceptionWhenThePawnCellRowIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> pawn.getAllPossibleCells(new Cell('B', 15)));
    }

    @Test
    public void shouldThrowAnExceptionWhenThePawnCellColumnIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> pawn.getAllPossibleCells(new Cell('I', 5)));
    }

    @Test
    public void shouldThrowAnExceptionWhenThePawnCellColumnAndRowAreInvalid() {
        assertThrows(IllegalArgumentException.class, () -> pawn.getAllPossibleCells(new Cell('I', 15)));
    }
}
