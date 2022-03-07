package com.marsrover.validator;

import com.marsrover.constants.Direction;

/**
 * Custom Position Input Validator
 */
public class PositionValidator implements BaseValidator{
    private final String[] position;

    public PositionValidator(String[] position) {
        this.position = position;
    }

    @Override
    public boolean validate() {
        return position.length == 3 && position[2]!=null && Direction.contains(position[2]);
    }
}
