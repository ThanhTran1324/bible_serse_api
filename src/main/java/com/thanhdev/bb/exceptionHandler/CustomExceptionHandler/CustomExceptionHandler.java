package com.thanhdev.bb.exceptionHandler.CustomExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.thanhdev.bb.exceptions.RequestInvalidException;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(RequestInvalidException.class)
   protected ResponseEntity<Object> exception(RequestInvalidException exception) {
       return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
   }
}
