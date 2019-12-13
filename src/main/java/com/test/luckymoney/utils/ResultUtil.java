package com.test.luckymoney.utils;

import com.test.luckymoney.enums.ExceptionEnum;
import com.test.luckymoney.vo.Result;

/**
 * Created by kui.jin ON 2019/12/13
 */
public class ResultUtil {

    public static Result success(Object o){
        Result result= new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(o);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result= new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(ExceptionEnum exceptionEnum){
        Result result= new Result();
        result.setCode(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        return result;
    }

}
