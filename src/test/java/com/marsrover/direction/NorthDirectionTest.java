package com.marsrover.direction;

import com.marsrover.constants.Direction;
import com.marsrover.helper.TestUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NorthDirectionTest extends TestUtil {
    @Before
    public void setup(){
        facingDirection=new NorthDirection();
        roverRobot=getRoverRobot(facingDirection);
    }
    @Test
    public void test_north_direction_move_forward() {
        roverRobot.move();
        Assert.assertEquals(2,roverRobot.getPosition().getY());
    }

    @Test
    public void test_north_direction_turn_left() {
        roverRobot.turnRight();
        Assert.assertEquals(Direction.E.name(),roverRobot.getFacingDirection().name());
    }

    @Test
    public void test_north_direction_turn_right() {
        roverRobot.turnLeft();
        Assert.assertEquals(Direction.W.name(),roverRobot.getFacingDirection().name());
    }

    @Test
    public void test_north_direction_get_name() {
        Assert.assertEquals(facingDirection.name(),Direction.N.name());

    }
}