package com.marsrover.invoker;

import com.marsrover.command.ICommand;
import com.marsrover.model.RoverRobot;
import com.marsrover.validator.RoverRobotPositionValidator;

import java.util.LinkedList;

/**
 * command invoker class
 */
public class CommandExecutor {
    private final RoverRobot roverRobot;

    public CommandExecutor(RoverRobot roverRobot) {
        this.roverRobot = roverRobot;
    }

    public void executeCommandList(LinkedList<ICommand> commands) {
        for (ICommand command : commands) {
            RoverRobotPositionValidator positionValidator = new RoverRobotPositionValidator(roverRobot.getPosition(), roverRobot.getPlateau());
            if (positionValidator.validate()) {
                command.execute(roverRobot);
            }
        }
    }
}