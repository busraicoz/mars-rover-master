package com.marsrover.util;

import com.marsrover.command.ICommand;
import com.marsrover.constants.Command;
import com.marsrover.constants.CommonConstants;
import com.marsrover.constants.Direction;
import com.marsrover.model.Plateau;
import com.marsrover.model.Position;
import com.marsrover.model.RoverRobot;

import java.util.LinkedList;

/**
 * Mars Rover Application Test Input Helper Class
 */
public class MarsRoverTestInputUtil extends MarsRoverCommonUtil{
    public void writeSampleInputsSolutions(){
        System.out.println(generateTestInput());
        Plateau plateau = new Plateau(new Position(CommonConstants.TEST_PLATEAU_GRID_X,CommonConstants.TEST_PLATEAU_GRID_Y));

        //First Sample Solution
        RoverRobot roverRobot = getRoverRobot(plateau,CommonConstants.TEST_X_POSITION,CommonConstants.TEST_Y_POSITION,CommonConstants.TEST_FACING_DIRECTION,CommonConstants.TEST_DIRECTION_COMMAND);
        System.out.println(CommonConstants.EXPECTED_OUTPUT+"\n"+ showCurrentPositionAndFacingDirection(roverRobot));

        //Second Sample's Solution
        roverRobot = getRoverRobot(plateau,CommonConstants.TEST_X_POSITION2,CommonConstants.TEST_Y_POSITION2,CommonConstants.TEST_FACING_DIRECTION2,CommonConstants.TEST_DIRECTION_COMMAND2);
        System.out.println(showCurrentPositionAndFacingDirection(roverRobot));
    }

    private RoverRobot getRoverRobot(Plateau plateau,int xPosition,int yPosition,Direction facingDirection,String directionCommands) {
        RoverRobot roverRobot=new RoverRobot(facingDirection.getDirection(),new Position(xPosition,yPosition), plateau);
        String[] directionArray=directionCommands.split("");
        LinkedList<ICommand> commands = new LinkedList<>();
        for (String direction : directionArray) {
            ICommand currentCommand = Command.valueOf(direction).getCommand();
            commands.add(currentCommand);
        }
        executeDirectionCommands(roverRobot,commands);
        return roverRobot;
    }
    private String generateTestInput(){
        return new StringBuilder().append(CommonConstants.TEST_INPUT).
                append("\n").
                append(CommonConstants.TEST_PLATEAU_GRID_X).
                append(" ").append(CommonConstants.TEST_PLATEAU_GRID_Y).
                append("\n").append(CommonConstants.TEST_X_POSITION).
                append(" ").append(CommonConstants.TEST_Y_POSITION).
                append(" ").append(CommonConstants.TEST_FACING_DIRECTION).
                append("\n").append(CommonConstants.TEST_DIRECTION_COMMAND).
                append("\n").append(CommonConstants.TEST_X_POSITION2).
                append(" ").append(CommonConstants.TEST_Y_POSITION2).
                append(" ").append(CommonConstants.TEST_FACING_DIRECTION2).
                append("\n").append(CommonConstants.TEST_DIRECTION_COMMAND2).toString();
    }
}
