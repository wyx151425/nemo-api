package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.context.exception.NemoJSRException;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.util.constant.NemoConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 控制器基类
 *
 * @author 王振琦  2017/12/25
 */
public class NemoController {

    private static final Logger logger = LoggerFactory.getLogger(NemoController.class);

    @Autowired
    private HttpServletRequest request;

    public User getUser() {
        return (User) request.getAttribute(NemoConst.USER);
    }

    public HttpServletRequest getHttpRequest() {
        return request;
    }

    void bindingResultInspect(BindingResult result) {
        if (result.hasErrors()) {
            throw new NemoJSRException();
        }
    }
}
