package com.marsrover.util;

import com.marsrover.command.ICommand;
import com.marsrover.constants.Command;
import com.marsrover.constants.CommonConstants;
import com.marsrover.constants.Direction;
import com.marsrover.direction.IFacingDirection;
import com.marsrover.exception.InvalidInputParameterException;
import com.marsrover.model.Plateau;
import com.marsrover.model.Position;
import com.marsrover.model.RoverRobot;
import com.marsrover.validator.DirectionValidator;
import com.marsrover.validator.PlateauValidator;
import com.marsrover.validator.PositionValidator;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Mars Rover Application Custom Input Helper Class
 */
public class MarsRoverCustomInputUtil extends MarsRoverCommonUtil {
    public Plateau getPlateauCoordinatesFromClient() {
        System.out.println("Please Enter The Plateau Size (Example: 5 5):");
        Scanner plateauSize = new Scanner(System.in);
        String[] plateau = plateauSize.nextLine().split(" ");
        PlateauValidator plateauValidator = new PlateauValidator(plateau);
        if (plateauValidator.validate()) {
            return new Plateau(new Position(Integer.parseInt(plateau[0]), Integer.parseInt(plateau[1])));
        } else {
            throw new InvalidInputParameterException("Plateau Input Invalid! (Correct Sample : 5 5)");
        }
    }

    public RoverRobot getPositionAndDirectionInfoFromClient(Plateau plateau) {
        System.out.println("Please Enter The Position and Facing Direction (Example: 1 2 N):");
        Scanner position = new Scanner(System.in);
        String[] inputArray = position.nextLine().split(" ");
        PositionValidator positionValidator = new PositionValidator(inputArray);
        if (positionValidator.validate()) {
            int positionX = Integer.parseInt(inputArray[0]);
            int positionY = Integer.parseInt(inputArray[1]);
            IFacingDirection direction = Direction.valueOf(inputArray[2]).getDirection();
            return new RoverRobot(direction, new Position(positionX, positionY), plateau);
        } else {
            throw new InvalidInputParameterException("Position Input Invalid! (Correct Sample : 1 2 N)");
        }

    }

    public LinkedList<ICommand> getDirectionCommandsFromClient() {
        System.out.println("Please Enter The Direction Commands (Example: LMLMLMLMM):");
        Scanner directionCommands = new Scanner(System.in);
        String[] directionArray = directionCommands.nextLine().split("");
        DirectionValidator directionValidator = new DirectionValidator(directionArray);
        if (directionValidator.validate()) {
            LinkedList<ICommand> commandArrayList = new LinkedList<>();
            for (String direction : directionArray) {
                ICommand currentCommand = Command.valueOf(direction).getCommand();
                commandArrayList.add(currentCommand);
            }
            return commandArrayList;
        } else {
            throw new InvalidInputParameterException("Direction Values Invalid!. Directions can be just L, R or M(Correct Sample : LMLMLMLMM)");

        }
    }

    public String getContinueAnswerFromClient() {
        System.out.println(CommonConstants.CONTINUE_QUESTION);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
