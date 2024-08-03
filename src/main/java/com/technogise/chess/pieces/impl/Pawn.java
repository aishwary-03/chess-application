package com.technogise.chess.pieces.impl;

import com.technogise.chess.domain.Spot;
import com.technogise.chess.pieces.Piece;
import com.technogise.chess.validator.SpotValidator;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements Piece {

    List<Spot> possibleSpots = new ArrayList<Spot>();

    @Override
    public List<Spot> getAllPossibleSpots(Spot spot) {
        Spot possibleSpot = new Spot(spot.column(), spot.row() + 1);
        if (SpotValidator.isAValidSpot(possibleSpot)) {
            possibleSpots.add(possibleSpot);
        }
        return possibleSpots;
    }
}
