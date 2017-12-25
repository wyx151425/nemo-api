package com.rumofuture.nemo.model.dto;

import com.rumofuture.nemo.util.RespConst;

public class Response<T> {
    private int statusCode;
    private String message;
    private T data;

    public Response(T data) {
        this.statusCode = RespConst.SUCCESS.statusCode();
        this.data = data;
    }

    public Response(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public Response(RespConst respConst) {
        this.statusCode = respConst.statusCode();
        this.message = respConst.value();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
