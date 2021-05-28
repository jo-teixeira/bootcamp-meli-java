package com.meli.m6a2.exception.handler;

import com.meli.m6a2.exception.ErrorResponse;
import com.meli.m6a2.exception.MesaNotFoundException;
import com.meli.m6a2.exception.PedidoNotFoundException;
import com.meli.m6a2.exception.PratoNotFoundException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler(PedidoNotFoundException.class)
    protected ResponseEntity<Object> handlePedidoNotFoundException(PedidoNotFoundException ex) {
        ErrorResponse apiError = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage() );
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(PratoNotFoundException.class)
    protected ResponseEntity<Object> handlePratoNotFoundException(PedidoNotFoundException ex) {
        ErrorResponse apiError = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage() );
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MesaNotFoundException.class)
    protected ResponseEntity<Object> handleMesaNotFoundException(PedidoNotFoundException ex) {
        ErrorResponse apiError = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage() );
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
}
