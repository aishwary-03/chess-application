package com.technogise.chess.validator;

import com.technogise.chess.domain.Cell;

public interface CellValidator {

    static boolean isAValidCell(Cell cell) {
        return cell.column() >= 'A'
                && cell.column() <= 'H'
                && cell.row() >= 1
                && cell.row() <= 8;
    }

}
