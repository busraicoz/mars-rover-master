package com.marsrover;

import com.marsrover.command.ICommand;
import com.marsrover.constants.CommonConstants;
import com.marsrover.model.Plateau;
import com.marsrover.model.RoverRobot;
import com.marsrover.util.MarsRoverCustomInputUtil;
import com.marsrover.util.MarsRoverTestInputUtil;
import java.util.*;

/**
 * Application Main Class
 */
public class MarsRoverApplication {
    public static void main(String[] args) {
        //Sample Test Inputs' Solution
        MarsRoverTestInputUtil marsRoverTestInputUtil= new MarsRoverTestInputUtil();
        marsRoverTestInputUtil.writeSampleInputsSolutions();

        //Custom Request
        MarsRoverCustomInputUtil marsRoverCustomInputUtil=new MarsRoverCustomInputUtil();
        Plateau plateau = marsRoverCustomInputUtil.getPlateauCoordinatesFromClient();

        String continueQuestionAnswer=CommonConstants.YES;
        while (continueQuestionAnswer.equals(CommonConstants.YES)){
            RoverRobot roverRobot = marsRoverCustomInputUtil.getPositionAndDirectionInfoFromClient(plateau);
            LinkedList<ICommand> commandArrayList=marsRoverCustomInputUtil.getDirectionCommandsFromClient();

            marsRoverCustomInputUtil.executeDirectionCommands(roverRobot, commandArrayList);
            System.out.println(CommonConstants.CURRENT_POSITION+"\n"+ marsRoverCustomInputUtil.showCurrentPositionAndFacingDirection(roverRobot));

            continueQuestionAnswer = marsRoverCustomInputUtil.getContinueAnswerFromClient();
        }
    }

}
