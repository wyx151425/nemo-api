package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.context.exception.NemoJSRException;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.util.NemoConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import javax.servlet.http.HttpServletRequest;

public class NemoController {

    private static final Logger logger = LoggerFactory.getLogger(NemoController.class);

    @Autowired
    private HttpServletRequest request;

    public Integer getUserId() {
        return (Integer) request.getAttribute(NemoConst.USER_ID);
    }

    public User getCurrentUser() {
        return new User();
    }

    public HttpServletRequest getHttpRequest() {
        return request;
    }

    protected void bindingResultInspect(BindingResult result) {
        if (result.hasErrors()) {
            FieldError error = (FieldError) result.getAllErrors().get(0);
            throw new NemoJSRException(error.getField() + error.getDefaultMessage());
        }
    }
}
