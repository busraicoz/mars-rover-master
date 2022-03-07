package com.marsrover.validator;

import com.marsrover.exception.InvalidPositionException;
import com.marsrover.helper.TestUtil;
import com.marsrover.model.Plateau;
import com.marsrover.model.Position;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RoverRobotPositionValidatorTest extends TestUtil {
    private RoverRobotPositionValidator positionValidator;

    @Before
    public void setUp(){
        plateau=new Plateau(getPosition(5,5));
}
    @Test
    public void test_valid_position_for_rover_robot(){
        position=new Position(1,2);
        positionValidator=new RoverRobotPositionValidator(position,plateau);
        boolean result=positionValidator.validate();
        Assert.assertTrue(result);
    }
    @Test(expected = InvalidPositionException.class)
    public void test_invalid_x_position_for_rover_robot(){
        position=new Position(6,2);
        positionValidator=new RoverRobotPositionValidator(position,plateau);
        positionValidator.validate();
    }
    @Test(expected = InvalidPositionException.class)
    public void test_invalid_y_position_for_rover_robot(){
        position=new Position(3,6);
        positionValidator=new RoverRobotPositionValidator(position,plateau);
        positionValidator.validate();
    }
}