package com.pragma.powerup.usermicroservice.domain.exceptions;

public class InvalidDocumentNumberException extends RuntimeException{
    public InvalidDocumentNumberException(String message) {
        super(message);
    }
}
