package com.marsrover.command;

import com.marsrover.model.RoverRobot;
/**
 * Move Forward Command
 */
public class MoveCommand implements ICommand {
    @Override
    public void execute(RoverRobot roverRobot) {
        roverRobot.move();
    }
}
