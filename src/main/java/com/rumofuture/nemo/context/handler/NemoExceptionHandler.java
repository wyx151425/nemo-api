package com.rumofuture.nemo.context.handler;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.context.exception.NemoJSRException;
import com.rumofuture.nemo.model.entity.Response;
import com.rumofuture.nemo.util.constant.RespStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author WangZhenqi
 */
@RestControllerAdvice
public class NemoExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Response<Object> handleException(Exception e) {
        return new Response<>(RespStatus.SYSTEM_ERROR);
    }

    @ExceptionHandler(value = NemoException.class)
    public Response<Object> handleNemoException(NemoException e) {
        return new Response<>(e.getStatusCode());
    }

    @ExceptionHandler(value = NemoJSRException.class)
    public Response<Object> handleNemoJSRException(NemoJSRException e) {
        return new Response<>(RespStatus.PARAM_ERROR);
    }
}
