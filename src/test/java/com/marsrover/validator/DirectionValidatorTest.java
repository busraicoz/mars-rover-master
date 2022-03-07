package com.marsrover.validator;

import org.junit.Assert;
import org.junit.Test;

public class DirectionValidatorTest {
    private DirectionValidator directionValidator;
    @Test
    public void test_for_valid_direction_input(){
        String directionString="LLRRMMLR";
        String[] directionStringArr=directionString.split("");
        directionValidator=new DirectionValidator(directionStringArr);
        boolean result=directionValidator.validate();
        Assert.assertTrue(result);
    }
    @Test
    public void test_for_invalid_direction_input(){
        String directionString="LLRTKRMMLR";
        String[] directionStringArr=directionString.split("");
        directionValidator=new DirectionValidator(directionStringArr);
        boolean result=directionValidator.validate();
        Assert.assertFalse(result);

    }
}