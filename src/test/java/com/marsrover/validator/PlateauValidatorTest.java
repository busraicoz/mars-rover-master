package com.marsrover.validator;

import org.junit.Assert;
import org.junit.Test;

public class PlateauValidatorTest {
    private PlateauValidator plateauValidator;
    @Test
    public void test_for_valid_plateau_input(){
        String plateauString="5 5";
        String[] plateauStringArr=plateauString.split(" ");
        plateauValidator=new PlateauValidator(plateauStringArr);
        boolean result=plateauValidator.validate();
        Assert.assertTrue(result);
    }
    @Test
    public void test_for_invalid_plateau_input(){
        String plateauString="5 6 3";
        String[] plateauStringArr=plateauString.split(" ");
        plateauValidator=new PlateauValidator(plateauStringArr);
        boolean result=plateauValidator.validate();
        Assert.assertFalse(result);
    }
}