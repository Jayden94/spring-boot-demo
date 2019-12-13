package com.test.luckymoney.interceptor;

import com.test.luckymoney.enums.ExceptionEnum;
import com.test.luckymoney.exception.UserException;
import com.test.luckymoney.utils.ResultUtil;
import com.test.luckymoney.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by kui.jin ON 2019/12/13
 * 自定义全局异常
 */
@ControllerAdvice
public class ExceptionInterceptor  {

    @ExceptionHandler
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof UserException){
            UserException userException = (UserException) e;
            return ResultUtil.error(userException.getCode(),userException.getMessage());
        }
        return ResultUtil.error(ExceptionEnum.UNKONW_ERROR);
    }
}
