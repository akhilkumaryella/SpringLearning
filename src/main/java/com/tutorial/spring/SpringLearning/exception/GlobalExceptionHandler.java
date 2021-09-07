package com.tutorial.spring.SpringLearning.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionEntity> handleException(Exception ex) {

        return new ResponseEntity<>(new ExceptionEntity("badvalue1", "badrequest1"),
                HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<ExceptionEntity> handleInvalidRequestException(InvalidRequestException ex) {

//        return new ResponseEntity<>(new ExceptionEntity("badvalue", "badrequest"),
//                HttpStatus.BAD_REQUEST);

        return ResponseEntity.ok(new ExceptionEntity("badvalue", "badrequest"));

    }
}
