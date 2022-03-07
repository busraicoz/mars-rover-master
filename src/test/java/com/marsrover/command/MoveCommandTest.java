package com.marsrover.command;

import com.marsrover.direction.EastDirection;
import com.marsrover.direction.NorthDirection;
import com.marsrover.direction.SouthDirection;
import com.marsrover.direction.WestDirection;
import com.marsrover.helper.TestUtil;
import org.junit.Assert;
import org.junit.Test;

public class MoveCommandTest extends TestUtil {

    @Test
    public void test_move_command_for_east_faced_rover_robot(){
        roverRobot=getRoverRobot(new EastDirection());
        roverRobot.move();
        Assert.assertEquals(roverRobot.getPosition().getX(), 2);
    }
    @Test
    public void test_move_command_for_south_faced_rover_robot(){
        roverRobot=getRoverRobot(new SouthDirection());
        roverRobot.move();
        Assert.assertEquals(roverRobot.getPosition().getY(), 0);
    }
    @Test
    public void test_move_command_for_west_faced_rover_robot(){
        roverRobot=getRoverRobot(new WestDirection());
        roverRobot.move();
        Assert.assertEquals(roverRobot.getPosition().getX(), 0);
    }
    @Test
    public void test_move_command_for_north_faced_rover_robot(){
        roverRobot=getRoverRobot(new NorthDirection());
        roverRobot.move();
        Assert.assertEquals(roverRobot.getPosition().getY(), 2);

    }
}