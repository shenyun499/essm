package com.essm.common;


import java.io.Serializable;

/**
 * @Description
 * 统一封装返回 前端交互格式
 * @Author xuexue
 * @Date 2020/6/13 15:14
 */
public class Result implements Serializable {

    //状态码
    private int code;
    //响应消息
    private String message;
    //响应数据
    private Object data;

    /**
     * 封装成功响应状态码、消息、数据
     *
     * @param code 状态码
     * @param message 响应消息
     * @param data 响应数据
     * @return
     */
    public static Result succ(int code, String message, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
    public static Result succ(Object data) {
        return succ(200, "操作成功", data);
    }

    /**
     * 封装失败响应状态码、消息、数据
     *
     * @param code 状态码
     * @param message 响应消息
     * @param data 响应数据
     * @return
     */
    public static Result fail(int code, String message, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
    public static Result fail(String message) {
        return fail(400, message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
