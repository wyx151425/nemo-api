package com.rumofuture.nemo.context.exception;

import com.rumofuture.nemo.util.constant.RespConst;

public class NemoException extends RuntimeException {

    private RespConst response;

    public NemoException(RespConst response) {
        this.response = response;
    }

    public RespConst getResponse() {
        return response;
    }
}
