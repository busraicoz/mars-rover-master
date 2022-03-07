package com.marsrover.model;

import com.marsrover.direction.IFacingDirection;

/**
 * Rover Robot Model
 */
public class RoverRobot {
    private final Position position;
    private IFacingDirection facingDirection;
    private Plateau plateau;

    public RoverRobot(IFacingDirection directionState, Position position, Plateau plateau) {
        this.facingDirection = directionState;
        this.position = position;
        this.plateau = plateau;
    }

    public void turnRight() {
        facingDirection = facingDirection.turnRight(this);
    }

    public void turnLeft() {
        facingDirection = facingDirection.turnLeft(this);
    }

    public void move() {
        facingDirection.move(this);

    }

    public Position getPosition() {
        return position;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    public IFacingDirection getFacingDirection() {
        return facingDirection;
    }
}
