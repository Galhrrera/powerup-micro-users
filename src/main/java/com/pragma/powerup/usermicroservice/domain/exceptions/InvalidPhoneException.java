package com.pragma.powerup.usermicroservice.domain.exceptions;

public class InvalidPhoneException extends RuntimeException{
    public InvalidPhoneException(String message) {
        super(message);
    }
}
