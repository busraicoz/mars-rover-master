package com.marsrover.invoker;

import com.marsrover.command.ICommand;
import com.marsrover.command.LeftCommand;
import com.marsrover.command.MoveCommand;
import com.marsrover.constants.Direction;
import com.marsrover.direction.NorthDirection;
import com.marsrover.exception.InvalidPositionException;
import com.marsrover.helper.TestUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class CommandExecutorTest extends TestUtil {
    private CommandExecutor commandExecutor;
    @Before
    public void setUp(){
        roverRobot=getRoverRobot(new NorthDirection());
        commandExecutor=new CommandExecutor(roverRobot);
    }
    @Test
    public void test_multiple_command_executor(){
        LinkedList<ICommand> commands=new LinkedList();
        commands.add(new MoveCommand());
        commands.add(new MoveCommand());
        commands.add(new LeftCommand());
        commandExecutor.executeCommandList(commands);
        Assert.assertEquals(roverRobot.getPosition().getX(),1);
        Assert.assertEquals(roverRobot.getPosition().getY(),3);
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.W.name());
}
    @Test(expected = InvalidPositionException.class)
    public void test_multiple_command_executor_for_invalid_position(){
        LinkedList<ICommand> commands=new LinkedList();
        commands.add(new MoveCommand());
        commands.add(new MoveCommand());
        commands.add(new LeftCommand());
        commands.add(new MoveCommand());
        commands.add(new MoveCommand());
        commands.add(new MoveCommand());
        commands.add(new MoveCommand());
        commandExecutor.executeCommandList(commands);
        Assert.assertEquals(roverRobot.getPosition().getX(),1);
        Assert.assertEquals(roverRobot.getPosition().getY(),3);
        Assert.assertEquals(roverRobot.getFacingDirection().name(), Direction.W.name());
    }
}