package com.marsrover.helper;

import com.marsrover.constants.Direction;
import com.marsrover.direction.IFacingDirection;
import com.marsrover.model.Plateau;
import com.marsrover.model.Position;
import com.marsrover.model.RoverRobot;

public class TestUtil {
    public IFacingDirection facingDirection;
    public RoverRobot roverRobot;
    public Position position;
    public Plateau plateau;
    public RoverRobot getRoverRobot(IFacingDirection direction){
        return new RoverRobot(direction,getPosition(1,1),getPlateau(5,5));

    }
    public Position getPosition(int x,int y){
        return new Position(x,y);
    }
    public Plateau getPlateau(int x,int y){
        return new Plateau(getPosition(x,y));
    }
}
