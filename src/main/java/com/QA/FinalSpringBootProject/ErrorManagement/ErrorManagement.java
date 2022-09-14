package com.QA.FinalSpringBootProject.ErrorManagement;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ErrorManagement extends RuntimeException{

    public ErrorManagement(String message){
        super(message);
    }
}
