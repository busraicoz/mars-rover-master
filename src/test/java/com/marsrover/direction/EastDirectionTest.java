package com.marsrover.direction;

import com.marsrover.constants.Direction;
import com.marsrover.helper.TestUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EastDirectionTest extends TestUtil {
    @Before
    public void setup(){
        facingDirection=new EastDirection();
        roverRobot=getRoverRobot(facingDirection);
    }
    @Test
    public void test_east_direction_move_forward() {
        roverRobot.move();
        Assert.assertEquals(2,roverRobot.getPosition().getX());
    }

    @Test
    public void test_east_direction_turn_left() {
        roverRobot.turnRight();
        Assert.assertEquals(Direction.S.name(),roverRobot.getFacingDirection().name());
    }

    @Test
    public void test_east_direction_turn_right() {
        roverRobot.turnLeft();
        Assert.assertEquals(Direction.N.name(),roverRobot.getFacingDirection().name());
    }

    @Test
    public void test_east_direction_get_name() {
        Assert.assertEquals(facingDirection.name(),Direction.E.name());

    }
}