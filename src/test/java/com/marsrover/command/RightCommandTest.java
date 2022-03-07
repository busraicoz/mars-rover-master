package com.marsrover.command;

import com.marsrover.constants.Direction;
import com.marsrover.direction.EastDirection;
import com.marsrover.direction.NorthDirection;
import com.marsrover.direction.SouthDirection;
import com.marsrover.direction.WestDirection;
import com.marsrover.helper.TestUtil;
import org.junit.Assert;
import org.junit.Test;

public class RightCommandTest extends TestUtil {
    @Test
    public void test_right_command_for_east_faced_rover_robot(){
        roverRobot=getRoverRobot(new EastDirection());
        roverRobot.turnRight();
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.S.name());
    }
    @Test
    public void test_right_command_for_south_faced_rover_robot(){
        roverRobot=getRoverRobot(new SouthDirection());
        roverRobot.turnRight();
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.W.name());
    }
    @Test
    public void test_right_command_for_west_faced_rover_robot(){
        roverRobot=getRoverRobot(new WestDirection());
        roverRobot.turnRight();
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.N.name());
    }
    @Test
    public void test_right_command_for_north_faced_rover_robot(){
        roverRobot=getRoverRobot(new NorthDirection());
        roverRobot.turnRight();
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.E.name());

    }
}