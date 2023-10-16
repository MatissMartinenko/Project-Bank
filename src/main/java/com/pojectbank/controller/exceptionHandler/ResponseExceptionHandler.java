package com.pojectbank.controller.exceptionHandler;

import com.pojectbank.exception.SomeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ResponseExceptionHandler {

    @ExceptionHandler(SomeException.class)
    public ResponseEntity<ErrorResponse> exceptionHandlerNotFound(Throwable ex) {
        ErrorResponse response = ErrorResponse.builder(ex, HttpStatus.NOT_FOUND, ex.getMessage()).build();
        return ResponseEntity.ofNullable(response);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> exceptionHeadlerBadRequest(Throwable throwable) {
        ErrorResponse response = ErrorResponse.builder(throwable, HttpStatus.BAD_REQUEST, throwable.getMessage()).build();
        return ResponseEntity.ofNullable(response);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> exceptionHandlerNotAccess(Throwable thr) {
        ErrorResponse response = ErrorResponse.builder(thr, HttpStatus.NOT_ACCEPTABLE, thr.getMessage()).build();
        return ResponseEntity.ofNullable(response);
    }
}
