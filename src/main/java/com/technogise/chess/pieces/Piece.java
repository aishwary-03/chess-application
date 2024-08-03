package com.technogise.chess.pieces;

import com.technogise.chess.domain.Spot;

import java.util.List;

public interface Piece {

    List<Spot> getAllPossibleSpots(Spot spot);

}
