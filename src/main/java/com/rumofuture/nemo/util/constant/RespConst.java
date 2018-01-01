package com.rumofuture.nemo.util.constant;

public enum RespConst {

    SUCCESS(200, "success"),
    STATUS_ERROR(300, "statusError"),
    SYSTEM_ERROR(500, "systemError"),
    PARAM_ERROR(601, "paramError"),
    USER_UNREGISTER(9000, "userUnregister"),
    USER_LOGIN_TIMEOUT(9001, "userLoginTimeout"),
    USER_LOGIN_PASSWORD_ERROR(9002, "userLoginPasswordError");

    private int statusCode;
    private String value;

    RespConst(int statusCode, String value) {
        this.statusCode = statusCode;
        this.value = value;
    }

    public int statusCode() {
        return statusCode;
    }

    public String value() {
        return value;
    }
}
