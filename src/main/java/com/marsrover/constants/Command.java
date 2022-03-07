package com.marsrover.constants;

import com.marsrover.command.ICommand;
import com.marsrover.command.LeftCommand;
import com.marsrover.command.MoveCommand;
import com.marsrover.command.RightCommand;

import java.util.Arrays;

/**
 * Command Enum
 */
public enum Command {
    L(new LeftCommand()),
    R(new RightCommand()),
    M(new MoveCommand());

    private final ICommand ICommand;

    Command(ICommand ICommand) {
        this.ICommand = ICommand;
    }

    public ICommand getCommand() {
        return ICommand;
    }

    public static boolean contains(String command) {
        return Arrays.stream(Command.values()).anyMatch(commandEnumValue -> commandEnumValue.name().equals(command));
    }

}
