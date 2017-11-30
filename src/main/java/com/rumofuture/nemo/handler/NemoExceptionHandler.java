package com.rumofuture.nemo.handler;

import com.rumofuture.nemo.exception.NemoException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class NemoExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = NemoException.class)
    public Object nemoExceptionHandler(NemoException e) {
        return e.getResponse().getMessage();
    }
}
