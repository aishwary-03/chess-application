package com.technogise.chess.validator;

import com.technogise.chess.domain.Spot;

public interface SpotValidator {

    static boolean isAValidSpot(Spot spot) {
        return spot.column() >= 'A'
                && spot.column() <= 'H'
                && spot.row() > 0
                && spot.row() < 8;
    }

}
