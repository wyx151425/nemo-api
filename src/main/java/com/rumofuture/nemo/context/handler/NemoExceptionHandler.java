package com.rumofuture.nemo.context.handler;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.context.exception.NemoJSRException;
import com.rumofuture.nemo.model.dto.Response;
import com.rumofuture.nemo.util.RespConst;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NemoExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Response<Object> handleException(Exception e) {
        return new Response<>(RespConst.SYSTEM_ERROR.statusCode(), RespConst.SYSTEM_ERROR.value());
    }

    @ExceptionHandler(value = NemoException.class)
    public Response<Object> handleNemoException(NemoException e) {
        return new Response<>(RespConst.SYSTEM_ERROR.statusCode(), e.getMessage());
    }

    @ExceptionHandler(value = NemoJSRException.class)
    public Response<Object> handleNemoJSRException(NemoJSRException e) {
        return new Response<>(RespConst.PARAM_ERROR.statusCode(), e.getMessage());
    }
}
