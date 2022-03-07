package com.marsrover.command;

import com.marsrover.model.RoverRobot;

/**
 * Turn Left Command
 */
public class LeftCommand implements ICommand {
    @Override
    public void execute(RoverRobot roverRobot) {
        roverRobot.turnLeft();
    }
}
