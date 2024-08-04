package com.technogise.chess.piece.impl;

import com.technogise.chess.domain.Cell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueenTest {

    private Queen queen;

    @BeforeEach
    public void setUp() {
        queen = new Queen();
    }

    @Test
    public void shouldReturnAListOfTwentySevenCellsWhenQueenIsPlacedInTheMiddle() {
        Cell cell = new Cell('E', 4);

        List<Cell> possibleCells = queen.getAllPossibleCells(cell);

        assertEquals(27, possibleCells.size());
    }

    @Test
    public void shouldReturnAListOfValidCellsWhenQueenIsPlacedInTheMiddleCell() {
        Cell cell = new Cell('E', 4);
        List<Cell> validCells = List.of(new Cell('E', 1),
                new Cell('E', 2),
                new Cell('E', 3),
                new Cell('E', 5),
                new Cell('E', 6),
                new Cell('E', 7),
                new Cell('E', 8),
                new Cell('A', 4),
                new Cell('B', 4),
                new Cell('C', 4),
                new Cell('D', 4),
                new Cell('F', 4),
                new Cell('G', 4),
                new Cell('H', 4),
                new Cell('B', 1),
                new Cell('C', 2),
                new Cell('D', 3),
                new Cell('F', 5),
                new Cell('G', 6),
                new Cell('H', 7),
                new Cell('A', 8),
                new Cell('B', 7),
                new Cell('C', 6),
                new Cell('D', 5),
                new Cell('F', 3),
                new Cell('G', 2),
                new Cell('H', 1));

        List<Cell> possibleCells = queen.getAllPossibleCells(cell);

        assertEquals(27, possibleCells.size());
        assertTrue(validCells.containsAll(possibleCells) && possibleCells.containsAll(validCells));
    }

    @Test
    public void shouldReturnAListOfTwentyOneCellWhenQueenIsPlacedAtFirstRowAndFirstColumn() {
        Cell cell = new Cell('A', 1);
        List<Cell> validCells = List.of(
                new Cell('A', 2),
                new Cell('A', 3),
                new Cell('A', 4),
                new Cell('A', 5),
                new Cell('A', 6),
                new Cell('A', 7),
                new Cell('A', 8),
                new Cell('B', 1),
                new Cell('C', 1),
                new Cell('D', 1),
                new Cell('E', 1),
                new Cell('F', 1),
                new Cell('G', 1),
                new Cell('H', 1),
                new Cell('B', 2),
                new Cell('C', 3),
                new Cell('D', 4),
                new Cell('E', 5),
                new Cell('F', 6),
                new Cell('G', 7),
                new Cell('H', 8));

        List<Cell> possibleCells = queen.getAllPossibleCells(cell);

        assertEquals(validCells.size(), possibleCells.size());
        assertTrue(validCells.containsAll(possibleCells) && possibleCells.containsAll(validCells));
    }

    @Test
    public void shouldReturnAListOfTwentyOneCellWhenQueenIsPlacedAtFirstRowAndLastColumn() {
        Cell cell = new Cell('H', 1);
        List<Cell> validCells = List.of(
                new Cell('H', 2),
                new Cell('H', 3),
                new Cell('H', 4),
                new Cell('H', 5),
                new Cell('H', 6),
                new Cell('H', 7),
                new Cell('H', 8),
                new Cell('A', 1),
                new Cell('B', 1),
                new Cell('C', 1),
                new Cell('D', 1),
                new Cell('E', 1),
                new Cell('F', 1),
                new Cell('G', 1),
                new Cell('A', 8),
                new Cell('B', 7),
                new Cell('C', 6),
                new Cell('D', 5),
                new Cell('E', 4),
                new Cell('F', 3),
                new Cell('G', 2));

        List<Cell> possibleCells = queen.getAllPossibleCells(cell);

        assertEquals(validCells.size(), possibleCells.size());
        assertTrue(validCells.containsAll(possibleCells) && possibleCells.containsAll(validCells));
    }

    @Test
    public void shouldReturnAListOfTwentyOneCellWhenQueenIsPlacedAtLastRowAndLastColumn() {
        Cell cell = new Cell('H', 8);
        List<Cell> validCells = List.of(
                new Cell('H', 1),
                new Cell('H', 2),
                new Cell('H', 3),
                new Cell('H', 4),
                new Cell('H', 5),
                new Cell('H', 6),
                new Cell('H', 7),
                new Cell('A', 8),
                new Cell('B', 8),
                new Cell('C', 8),
                new Cell('D', 8),
                new Cell('E', 8),
                new Cell('F', 8),
                new Cell('G', 8),
                new Cell('A', 1),
                new Cell('B', 2),
                new Cell('C', 3),
                new Cell('D', 4),
                new Cell('E', 5),
                new Cell('F', 6),
                new Cell('G', 7));

        List<Cell> possibleCells = queen.getAllPossibleCells(cell);

        assertEquals(validCells.size(), possibleCells.size());
        assertTrue(validCells.containsAll(possibleCells) && possibleCells.containsAll(validCells));
    }

    @Test
    public void shouldReturnAListOfTwentyOneCellWhenQueenIsPlacedAtLastRowAndFirstColumn() {
        Cell cell = new Cell('A', 8);
        List<Cell> validCells = List.of(
                new Cell('A', 1),
                new Cell('A', 2),
                new Cell('A', 3),
                new Cell('A', 4),
                new Cell('A', 5),
                new Cell('A', 6),
                new Cell('A', 7),
                new Cell('B', 8),
                new Cell('C', 8),
                new Cell('D', 8),
                new Cell('E', 8),
                new Cell('F', 8),
                new Cell('G', 8),
                new Cell('H', 8),
                new Cell('B', 7),
                new Cell('C', 6),
                new Cell('D', 5),
                new Cell('E', 4),
                new Cell('F', 3),
                new Cell('G', 2),
                new Cell('H', 1));

        List<Cell> possibleCells = queen.getAllPossibleCells(cell);

        assertEquals(validCells.size(), possibleCells.size());
        assertTrue(validCells.containsAll(possibleCells) && possibleCells.containsAll(validCells));
    }

    @Test
    public void shouldReturnAListOfTwentyOneCellsWhenQueenIsPlacedAtFirstRowAndMiddleColumn() {
        Cell cell = new Cell('E', 1);
        List<Cell> validCells = List.of(
                new Cell('E', 2),
                new Cell('E', 3),
                new Cell('E', 4),
                new Cell('E', 5),
                new Cell('E', 6),
                new Cell('E', 7),
                new Cell('E', 8),
                new Cell('A', 1),
                new Cell('B', 1),
                new Cell('C', 1),
                new Cell('D', 1),
                new Cell('F', 1),
                new Cell('G', 1),
                new Cell('H', 1),
                new Cell('F', 2),
                new Cell('G', 3),
                new Cell('H', 4),
                new Cell('D', 2),
                new Cell('C', 3),
                new Cell('B', 4),
                new Cell('A', 5));

        List<Cell> possibleCells = queen.getAllPossibleCells(cell);

        assertEquals(validCells.size(), possibleCells.size());
        assertTrue(validCells.containsAll(possibleCells) && possibleCells.containsAll(validCells));
    }

    @Test
    public void shouldThrowAnExceptionWhenTheQueenCellRowIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> queen.getAllPossibleCells(new Cell('B', 15)));
    }

    @Test
    public void shouldThrowAnExceptionWhenTheQueenCellColumnIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> queen.getAllPossibleCells(new Cell('I', 5)));
    }

    @Test
    public void shouldThrowAnExceptionWhenTheQueenCellColumnAndRowAreInvalid() {
        assertThrows(IllegalArgumentException.class, () -> queen.getAllPossibleCells(new Cell('I', 15)));
    }

}
