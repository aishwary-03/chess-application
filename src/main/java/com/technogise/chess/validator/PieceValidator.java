package com.technogise.chess.validator;

import com.technogise.chess.piece.PieceType;

public class PieceValidator {

    public static boolean isAValidPiece(String inputPiece) {
        for (PieceType pieceType : PieceType.values()) {
            if (pieceType.name().equalsIgnoreCase(inputPiece)) {
                return true;
            }
        }
        return false;
    }

}
