package com.rumofuture.nemo.model.dto;

public class Response<T> {
    private int statusCode;
    private String message;
    private T data;

    public Response() {
    }

    public Response(int statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public Response(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
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
