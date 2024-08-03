package com.technogise.chess.pieces.impl;

import com.technogise.chess.pieces.Piece;
import com.technogise.chess.domain.Spot;

import java.util.List;

public class Pawn implements Piece {

    @Override
    public List<Spot> getAllPossibleSpots(Spot spot) {
        Spot possibleSpot = new Spot(spot.column(), spot.row() + 1);
        return List.of(possibleSpot);
    }
}
