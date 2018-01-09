package com.rumofuture.nemo.util.constant;

/**
 * 响应状态码
 * @author WangZhenqi
 */
public class RespStatus {
    public static final int SUCCESS = 200;
    public static final int STATUS_ERROR = 300;
    public static final int SYSTEM_ERROR = 500;
    public static final int PARAM_ERROR = 601;
    public static final int SAVE_FAILED = 701;
    public static final int DELETE_FAILED = 702;
    public static final int UPDATE_FAILED = 703;
    public static final int QUERY_FAILED = 703;
    public static final int USER_UNREGISTER = 9000;
    public static final int USER_REGISTERED = 9001;
    public static final int USER_LOGIN_TIMEOUT = 9002;
    public static final int USER_LOGIN_PASSWORD_ERROR = 9003;
}
