package com.marsrover.util;

import com.marsrover.command.ICommand;
import com.marsrover.invoker.CommandExecutor;
import com.marsrover.model.RoverRobot;

import java.util.LinkedList;

/**
 * Mars Rover Application Common Helper Class
 */
public class MarsRoverCommonUtil {

    public String showCurrentPositionAndFacingDirection(RoverRobot roverRobot) {
        return new StringBuilder().append(roverRobot.getPosition().getX()).append(" ").append(roverRobot.getPosition().getY()).append(" ").append(roverRobot.getFacingDirection().name()).toString();
    }
    public void executeDirectionCommands(RoverRobot roverRobot, LinkedList<ICommand> commandArrayList) {
        CommandExecutor commandExecutor=new CommandExecutor(roverRobot);
        commandExecutor.executeCommandList(commandArrayList);
    }
}
