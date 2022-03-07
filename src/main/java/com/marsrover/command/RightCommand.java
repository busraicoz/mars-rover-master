package com.marsrover.command;

import com.marsrover.model.RoverRobot;
/**
 * Turn Right Command
 */
public class RightCommand implements ICommand {
    @Override
    public void execute(RoverRobot roverRobot) {
        roverRobot.turnRight();
    }
}
