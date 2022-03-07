package com.marsrover.exception;

/**
 * Invalid Custom Input Parameter Exception
 */
public class InvalidInputParameterException extends RuntimeException{
    public InvalidInputParameterException(String message){
        super(message);
    }
}
