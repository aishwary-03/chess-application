package com.technogise.chess.factory;

import com.technogise.chess.domain.Piece;

public class PieceFactory {

    public static Piece getPiece(String piece) {
        return switch (piece) {
            case "PAWN" -> null;
            case "KING" -> null;
            case "QUEEN" -> null;
            default -> throw new IllegalArgumentException();
        };
    }

}
