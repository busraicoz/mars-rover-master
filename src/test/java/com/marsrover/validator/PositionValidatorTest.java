package com.marsrover.validator;

import org.junit.Assert;
import org.junit.Test;

public class PositionValidatorTest {
    private PositionValidator positionValidator;
    @Test
    public void test_for_valid_plateau_input(){
        String positionString="1 2 N";
        String[] positionStringArr=positionString.split(" ");
        positionValidator=new PositionValidator(positionStringArr);
        boolean result=positionValidator.validate();
        Assert.assertTrue(result);
    }
    @Test
    public void test_for_invalid_position_direction_input(){
        String positionString="1 2 K";
        String[] positionStringArr=positionString.split(" ");
        positionValidator=new PositionValidator(positionStringArr);
        boolean result=positionValidator.validate();
        Assert.assertFalse(result);
    }
    @Test
    public void test_for_invalid_position_input_format(){
        String positionString="1 2 N N";
        String[] positionStringArr=positionString.split(" ");
        positionValidator=new PositionValidator(positionStringArr);
        boolean result=positionValidator.validate();
        Assert.assertFalse(result);
    }
}