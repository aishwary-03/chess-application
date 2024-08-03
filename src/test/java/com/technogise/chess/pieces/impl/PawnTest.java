package com.technogise.chess.pieces.impl;

import com.technogise.chess.domain.Spot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PawnTest {

    private Pawn pawn;

    @BeforeEach
    public void setUp() {
        pawn = new Pawn();
    }

    @Test
    public void shouldReturnOnlyOneSpotWhenThePawnCanMoveForward() {
        Spot inputSpot = new Spot('G', 1);

        List<Spot> possibleSpots = pawn.getAllPossibleSpots(inputSpot);

        assertEquals(1, possibleSpots.size());
    }

    @Test
    public void shouldReturnNoSpotsWhenThePawnCannotMoveForward() {
        Spot inputSpot = new Spot('G', 8);

        List<Spot> possibleSpots = pawn.getAllPossibleSpots(inputSpot);

        assertEquals(0, possibleSpots.size());
    }

    @Test
    public void shouldReturnTheNextRowWhenThePawnCanMoveForward() {
        Spot inputSpot = new Spot('G', 1);

        List<Spot> possibleSpots = pawn.getAllPossibleSpots(inputSpot);

        Spot spot = possibleSpots.getFirst();
        assertEquals(2, spot.row());
    }

    @Test
    public void shouldReturnTheSameColumnWhenThePawnCanMoveForward() {
        Spot inputSpot = new Spot('G', 1);

        List<Spot> possibleSpots = pawn.getAllPossibleSpots(inputSpot);

        Spot spot = possibleSpots.getFirst();
        assertEquals('G', spot.column());
    }
}
