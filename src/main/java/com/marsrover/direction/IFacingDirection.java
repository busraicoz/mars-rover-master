package com.marsrover.direction;

import com.marsrover.model.RoverRobot;

/**
 * Facing Direction Interface
 */
public interface IFacingDirection {
    void move(RoverRobot roverRobot);

    IFacingDirection turnLeft(RoverRobot roverRobot);

    IFacingDirection turnRight(RoverRobot roverRobot);

    String name();
}
