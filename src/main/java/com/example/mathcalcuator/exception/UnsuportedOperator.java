package com.example.mathcalcuator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuportedOperator  extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public UnsuportedOperator(String exception){
        super(exception);
    }
}
