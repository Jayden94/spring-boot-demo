package com.test.luckymoney.exception;


import com.test.luckymoney.enums.ExceptionEnum;

/**
 * Created by kui.jin ON 2019/12/13
 * 自定义用户异常
 */
public class UserException extends  RuntimeException{
    Integer code;

    public UserException() {
    }

    public UserException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
