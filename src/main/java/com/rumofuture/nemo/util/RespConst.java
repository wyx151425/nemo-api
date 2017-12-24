package com.rumofuture.nemo.util;

public enum RespConst {
    SUCCESS(200, "success"),
    SYSTEM_ERROR(500, "system error");

    private int statusCode;
    private String message;

    RespConst(int statusCode, String message) {
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
