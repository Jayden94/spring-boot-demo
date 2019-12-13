package com.test.luckymoney.enums;

/**
 * Created by kui.jin ON 2019/12/13
 */
public enum  ExceptionEnum {
    UNKONW_ERROR(-1,"未知错误"),
    AGE_ERROR(401,"年纪不正确"),
    MIN_AGE_ERROR(402,"年纪不能小于18岁");
    private Integer code;
    private String msg;


    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
