package com.rumofuture.nemo.util;

public enum ResponseEnum {
    SUCCESS(200, "success"),
    SYSTEM_ERROR(500, "system error");

    private int statusCode;
    private String message;

    ResponseEnum(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}
