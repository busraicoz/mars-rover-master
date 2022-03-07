package com.marsrover.command;

import com.marsrover.model.RoverRobot;

/**
 * Command Interface
 */
public interface ICommand {
    void execute(RoverRobot roverRobot);
}
