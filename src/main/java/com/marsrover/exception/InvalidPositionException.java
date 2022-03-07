package com.marsrover.exception;

/**
 * Invalid Rover Robot Position Exception
 */
public class InvalidPositionException extends RuntimeException{
    public InvalidPositionException(String message){
        super(message);
    }
}
