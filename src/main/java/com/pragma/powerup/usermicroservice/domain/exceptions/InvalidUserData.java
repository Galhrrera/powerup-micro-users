package com.pragma.powerup.usermicroservice.domain.exceptions;

public class InvalidUserData extends RuntimeException{
    public InvalidUserData(String message) {
        super(message);
    }
}
