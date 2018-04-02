package com.rumofuture.nemo.model.entity;

import com.rumofuture.nemo.util.constant.RespStatus;

/**
 * 响应对象
 *
 * @author 王振琦  2017/11/30
 */
public class Response<T> {

    private int statusCode;
    private T data;

    public Response() {
        this.statusCode = RespStatus.SUCCESS;
    }

    public Response(int statusCode) {
        this.statusCode = statusCode;
        this.data = null;
    }

    public Response(T data) {
        this.statusCode = RespStatus.SUCCESS;
        this.data = data;
    }

    public Response(int statusCode, T data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
