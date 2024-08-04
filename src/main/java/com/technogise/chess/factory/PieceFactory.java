package com.technogise.chess.factory;

import com.technogise.chess.piece.Piece;
import com.technogise.chess.piece.impl.King;
import com.technogise.chess.piece.impl.Pawn;
import com.technogise.chess.piece.impl.Queen;

public class PieceFactory {

    public static Piece getPiece(String piece) {
        return switch (piece) {
            case "PAWN" -> new Pawn();
            case "KING" -> new King();
            case "QUEEN" -> new Queen();
            default -> {
                throw new IllegalArgumentException("Invalid piece: " + piece);
            }
        };
    }

}
