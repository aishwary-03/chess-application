package com.technogise.chess.domain;

public record Cell(char column, int row) {

    @Override
    public String toString() {
        return column + "" + row + " ";
    }
}
