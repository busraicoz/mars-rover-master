package com.marsrover.direction;

import com.marsrover.constants.Direction;
import com.marsrover.model.RoverRobot;

/**
 * North Facing Direction Class
 */
public class NorthDirection implements IFacingDirection {

    @Override
    public void move(RoverRobot roverRobot) {
        int yCoordinate = roverRobot.getPosition().getY();
        roverRobot.getPosition().setY(yCoordinate + 1);
    }

    @Override
    public IFacingDirection turnLeft(RoverRobot roverRobot) {
        return new WestDirection();
    }

    @Override
    public IFacingDirection turnRight(RoverRobot roverRobot) {
        return new EastDirection();
    }

    @Override
    public String name() {
        return Direction.N.name();
    }
}
