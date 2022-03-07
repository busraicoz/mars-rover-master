package com.marsrover.validator;

import com.marsrover.exception.InvalidPositionException;
import com.marsrover.model.Plateau;
import com.marsrover.model.Position;

/**
 * Rover Robot Position Validator for Moving
 */
public class RoverRobotPositionValidator implements BaseValidator {
    private final Position position;
    private final Plateau plateau;

    public RoverRobotPositionValidator(Position position, Plateau plateau) {
        this.position = position;
        this.plateau = plateau;
    }

    @Override
    public boolean validate() {
        if (isStartPositionGreaterThanCurrentPosition(position) || isEndPositionLessThanCurrentPosition(position)) {
            throw new InvalidPositionException("Position is Invalid");
        }
        return true;
    }

    private boolean isStartPositionGreaterThanCurrentPosition(Position position) {
        return plateau.getStartPosition().getX() > position.getX() || plateau.getStartPosition().getY() > position.getY();
    }

    private boolean isEndPositionLessThanCurrentPosition(Position position) {
        return plateau.getEndPosition().getX() < position.getX() || plateau.getEndPosition().getY() < position.getY();
    }
}
