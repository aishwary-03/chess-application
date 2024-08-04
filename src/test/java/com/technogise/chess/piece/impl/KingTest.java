package com.technogise.chess.piece.impl;

import com.technogise.chess.domain.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class KingTest {

    private King king;

    @BeforeEach
    public void setup() {
        king = new King();
    }

    @Test
    public void shouldReturnAListOfEightPossibleCellsWhenKingCanMoveInAllDirections() {
        Cell cell = new Cell('D', 5);

        List<Cell> possibleCells = king.getAllPossibleCells(cell);

        assertEquals(8, possibleCells.size());
    }

    @Test
    public void shouldReturnEightValidPossibleCellsWhenKingCanMoveInAllDirections() {
        Cell cell = new Cell('D', 5);
        List<Cell> validCells = List.of(new Cell('C', 4), new Cell('C', 5), new Cell('C', 6), new Cell('D', 4), new Cell('D', 6), new Cell('E', 4), new Cell('E', 5), new Cell('E', 6));

        List<Cell> possibleCells = king.getAllPossibleCells(cell);

        assertTrue(possibleCells.containsAll(validCells) && validCells.containsAll(possibleCells));
    }

    @Test
    public void shouldReturnAListOfThreeCellsWhenKingIsPlacedAtFirstColumnAndFirstRow() {
        Cell cell = new Cell('A', 1);

        List<Cell> possibleCells = king.getAllPossibleCells(cell);

        assertEquals(3, possibleCells.size());
    }

    @Test
    public void shouldReturnValidCellsWhenKingIsPlacedAtFirstColumnAndFirstRow() {
        Cell cell = new Cell('A', 1);
        List<Cell> validPossibleCells = List.of(new Cell('A', 2), new Cell('B', 1), new Cell('B', 2));

        List<Cell> possibleCells = king.getAllPossibleCells(cell);

        assertTrue(possibleCells.containsAll(validPossibleCells) && validPossibleCells.containsAll(possibleCells));
    }

    @Test
    public void shouldReturnValidCellsWhenKingIsPlacedAtLastColumnAndLastRow() {
        Cell cell = new Cell('H', 8);
        List<Cell> validPossibleCells = List.of(new Cell('H', 7), new Cell('G', 8), new Cell('G', 7));

        List<Cell> possibleCells = king.getAllPossibleCells(cell);

        assertTrue(possibleCells.containsAll(validPossibleCells) && validPossibleCells.containsAll(possibleCells));
    }

    @Test
    public void shouldReturnThreeValidCellsWhenKingIsPlacedAtLastColumnAndFirstRow() {
        Cell cell = new Cell('H', 1);
        List<Cell> validPossibleCells = List.of(new Cell('G', 1), new Cell('G', 2), new Cell('H', 2));

        List<Cell> possibleCells = king.getAllPossibleCells(cell);

        assertTrue(possibleCells.containsAll(validPossibleCells) && validPossibleCells.containsAll(possibleCells));
    }

    @Test
    public void shouldReturnThreeValidCellsWhenKingIsPlacedAtFirstColumnAndLastRow() {
        Cell cell = new Cell('A', 8);
        List<Cell> validPossibleCells = List.of(new Cell('A', 7), new Cell('B', 7), new Cell('B', 8));

        List<Cell> possibleCells = king.getAllPossibleCells(cell);

        assertTrue(possibleCells.containsAll(validPossibleCells) && validPossibleCells.containsAll(possibleCells));
    }

    @Test
    public void shouldReturnAListOfFiveCellsWhenKingIsPlacedAtFirstRowAndMiddleColumn() {
        Cell cell = new Cell('D', 1);
        List<Cell> validPossibleCells = List.of(new Cell('C', 1), new Cell('C', 2), new Cell('D', 2), new Cell('E', 1), new Cell('E', 2));

        List<Cell> possibleCells = king.getAllPossibleCells(cell);

        assertEquals(5, possibleCells.size());
        assertTrue(possibleCells.containsAll(validPossibleCells) && validPossibleCells.containsAll(possibleCells));
    }

    @Test
    public void shouldThrowAnExceptionWhenTheKingCellColumnIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> king.getAllPossibleCells(new Cell('I', 7)));
    }

    @Test
    public void shouldThrowAnExceptionWhenTheKingCellRowIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> king.getAllPossibleCells(new Cell('H', 12)));
    }

    @Test
    public void shouldThrowAnExceptionWhenTheKingCellRowAndColumnAreInvalid() {
        assertThrows(IllegalArgumentException.class, () -> king.getAllPossibleCells(new Cell('I', 17)));
    }
}
