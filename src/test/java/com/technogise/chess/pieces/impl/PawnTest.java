package com.technogise.chess.pieces.impl;

import com.technogise.chess.domain.Spot;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PawnTest {

    @Test
    public void shouldReturnOnlyOneSpotWhenThePawnCanMoveForward() {
        Pawn pawn = new Pawn();
        Spot inputSpot = new Spot('G', 1);
        List<Spot> possibleSpots = pawn.getAllPossibleSpots(inputSpot);

        assertEquals(1, possibleSpots.size());
    }

}
