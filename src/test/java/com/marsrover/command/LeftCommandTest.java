package com.marsrover.command;

import com.marsrover.constants.Direction;
import com.marsrover.direction.EastDirection;
import com.marsrover.direction.NorthDirection;
import com.marsrover.direction.SouthDirection;
import com.marsrover.direction.WestDirection;
import com.marsrover.helper.TestUtil;
import org.junit.Assert;
import org.junit.Test;

public class LeftCommandTest extends TestUtil {

    @Test
    public void test_left_command_for_east_faced_rover_robot(){
        roverRobot=getRoverRobot(new EastDirection());
        roverRobot.turnLeft();
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.N.name());
    }
    @Test
    public void test_left_command_for_south_faced_rover_robot(){
        roverRobot=getRoverRobot(new SouthDirection());
        roverRobot.turnLeft();
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.E.name());
    }
    @Test
    public void test_left_command_for_west_faced_rover_robot(){
        roverRobot=getRoverRobot(new WestDirection());
        roverRobot.turnLeft();
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.S.name());
    }
    @Test
    public void test_left_command_for_north_faced_rover_robot(){
        roverRobot=getRoverRobot(new NorthDirection());
        roverRobot.turnLeft();
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.W.name());

    }
}