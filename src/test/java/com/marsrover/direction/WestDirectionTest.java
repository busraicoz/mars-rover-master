package com.marsrover.direction;

import com.marsrover.constants.Direction;
import com.marsrover.helper.TestUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WestDirectionTest extends TestUtil {
    @Before
    public void setup(){
        facingDirection=new WestDirection();
        roverRobot=getRoverRobot(facingDirection);
    }
    @Test
    public void test_west_direction_move_forward() {
        roverRobot.move();
        Assert.assertEquals(0,roverRobot.getPosition().getX());
    }

    @Test
    public void test_west_direction_turn_left() {
        roverRobot.turnRight();
        Assert.assertEquals(Direction.N.name(),roverRobot.getFacingDirection().name());
    }

    @Test
    public void test_west_direction_turn_right() {
        roverRobot.turnLeft();
        Assert.assertEquals(Direction.S.name(),roverRobot.getFacingDirection().name());
    }

    @Test
    public void test_west_direction_get_name() {
        Assert.assertEquals(facingDirection.name(),Direction.W.name());

    }
}