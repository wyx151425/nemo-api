package com.rumofuture.nemo.exception;

import com.rumofuture.nemo.util.RespConst;

public class NemoException extends RuntimeException {

    private RespConst response;

    public NemoException(RespConst response) {
        this.response = response;
    }

    public RespConst getResponse() {
        return response;
    }
}
