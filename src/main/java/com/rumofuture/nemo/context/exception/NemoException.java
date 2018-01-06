package com.rumofuture.nemo.context.exception;

public class NemoException extends RuntimeException {

    private int statusCode;

    public NemoException(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
