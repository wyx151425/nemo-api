package com.rumofuture.nemo.exception;

import com.rumofuture.nemo.util.ResponseEnum;

public class NemoException extends RuntimeException {

    private ResponseEnum response;

    public NemoException(ResponseEnum response) {
        this.response = response;
    }

    public ResponseEnum getResponse() {
        return response;
    }
}
