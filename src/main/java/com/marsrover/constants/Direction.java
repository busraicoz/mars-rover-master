package com.marsrover.constants;

import com.marsrover.direction.*;

import java.util.Arrays;

/**
 * Facing Direction Enum
 */
public enum Direction {
    N(new NorthDirection()),

    E(new EastDirection()),

    S(new SouthDirection()),

    W(new WestDirection());

    private final IFacingDirection direction;

    Direction(IFacingDirection direction) {
        this.direction = direction;
    }

    public IFacingDirection getDirection() {
        return direction;
    }

    public static boolean contains(String facingDirection) {
        return Arrays.stream(Direction.values()).anyMatch(directionEnumValue -> directionEnumValue.name().equals(facingDirection));
    }
}
