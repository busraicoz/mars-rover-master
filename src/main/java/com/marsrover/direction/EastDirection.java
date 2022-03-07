package com.marsrover.direction;

import com.marsrover.constants.Direction;
import com.marsrover.model.RoverRobot;

/**
 * East Facing Direction Class
 */
public class EastDirection implements IFacingDirection {

    @Override
    public void move(RoverRobot roverRobot) {
        int xCoordinate = roverRobot.getPosition().getX();
        roverRobot.getPosition().setX(xCoordinate + 1);
    }

    @Override
    public IFacingDirection turnLeft(RoverRobot roverRobot) {
        return new NorthDirection();
    }

    @Override
    public IFacingDirection turnRight(RoverRobot roverRobot) {
        return new SouthDirection();
    }

    @Override
    public String name() {
        return Direction.E.name();
    }
}
