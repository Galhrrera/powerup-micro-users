package com.pragma.powerup.usermicroservice.domain.exceptions;

public class InvalidUserEmail extends RuntimeException{
    public InvalidUserEmail(String message) {
        super(message);
    }
}
