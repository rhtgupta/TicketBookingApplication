package com.xyz.exceptions;

public class TheatreNotFoundException extends RuntimeException {

    public TheatreNotFoundException(String message) {
        super(message);
    }

}
