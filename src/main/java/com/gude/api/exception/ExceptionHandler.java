package com.gude.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {UserNotFoundException.class})
    public ResponseEntity<ErrorMessage> handleUserNotFoundException(){
        ErrorMessage errorMessage=new ErrorMessage();
        errorMessage.setMessage("User Information no found!");
        errorMessage.setCode(HttpStatus.BAD_REQUEST.value());
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }


}
