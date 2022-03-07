package com.marsrover.validator;

import com.marsrover.constants.Command;

import java.util.Arrays;

/**
 * Direction Custom Input Validator
 */
public class DirectionValidator implements BaseValidator{
    private String[] directions;

    public DirectionValidator(String[] directions) {
        this.directions = directions;
    }

    @Override
    public boolean validate() {
        return Arrays.stream(directions).allMatch(Command::contains);
    }
}
