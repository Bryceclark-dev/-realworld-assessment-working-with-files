package com.kenzie.app;

public class InvalidWeekException extends IllegalArgumentException{
    public InvalidWeekException(String message) {
        super(message);
    }

    public InvalidWeekException(String message, Throwable cause) {
        super(message, cause);
    }
}

