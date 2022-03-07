package com.marsrover.model;

/**
 * Plateau Model
 */
public class Plateau {
    private final Position startPosition=new Position(0,0);
    private final Position endPosition;

    public Plateau(Position endPosition) {
        this.endPosition = endPosition;
    }
    public Position getStartPosition() {
        return startPosition;
    }

    public Position getEndPosition() {
        return endPosition;
    }
}
