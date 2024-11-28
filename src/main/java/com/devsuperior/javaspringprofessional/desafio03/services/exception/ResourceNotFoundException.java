package com.devsuperior.javaspringprofessional.desafio03.services.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
