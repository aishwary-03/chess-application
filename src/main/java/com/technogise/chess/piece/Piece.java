package com.technogise.chess.piece;

import com.technogise.chess.domain.Cell;

import java.util.List;

public interface Piece {

    List<Cell> getAllPossibleCells(Cell cell);

}
