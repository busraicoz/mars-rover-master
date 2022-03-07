package com.marsrover.validator;

/**
 * Custom Plateau Input Validator
 */
public class PlateauValidator implements BaseValidator{
    private final String[] plateauCoordinates;

    public PlateauValidator(String[] plateauCoordinates) {
        this.plateauCoordinates = plateauCoordinates;
    }

    @Override
    public boolean validate() {
        return plateauCoordinates.length == 2;
    }
}
