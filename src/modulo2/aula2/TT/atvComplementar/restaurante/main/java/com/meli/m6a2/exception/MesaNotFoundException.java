package com.meli.m6a2.exception;

public class MesaNotFoundException extends RuntimeException{

    public MesaNotFoundException() {
    }

    public MesaNotFoundException(String message) {
        super(message);
    }
}
