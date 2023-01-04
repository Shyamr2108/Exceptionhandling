package com.example.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@ControllerAdvice
public class exception {

    @ExceptionHandler(InvalidData.class)
    public ResponseEntity<ErrorMessage>myHandler(InvalidData ex, WebRequest request){
        ErrorMessage error =new ErrorMessage();
        error.setLoacaldatetime(LocalDateTime.now());
        error.setMessage(ex.getMessage());
        error.setDetails(request.getDescription(false));

        return new ResponseEntity<ErrorMessage>(error,HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<?> noHandler(NoHandlerFoundException ex, WebRequest req){
        ErrorMessage error=new ErrorMessage();
        error.setMessage(ex.getMessage());
        error.setLoacaldatetime(LocalDateTime.now());
        error.setDetails(req.getDescription(false));
        return new ResponseEntity<ErrorMessage>(error,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> validException(MethodArgumentNotValidException ex){
        ErrorMessage error=new ErrorMessage();
        error.setMessage("Validation Error");
        error.setLoacaldatetime(LocalDateTime.now());
        error.setDetails(ex.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<ErrorMessage>(error,HttpStatus.BAD_REQUEST);
    }


}
