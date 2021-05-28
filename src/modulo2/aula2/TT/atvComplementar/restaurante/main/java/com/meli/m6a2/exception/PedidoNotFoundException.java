package com.meli.m6a2.exception;

public class PedidoNotFoundException extends RuntimeException{

    public PedidoNotFoundException() {
    }

    public PedidoNotFoundException(String message) {
        super(message);
    }
}
