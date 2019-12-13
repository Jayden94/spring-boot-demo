package com.test.luckymoney.service;

import com.test.luckymoney.enums.ExceptionEnum;
import com.test.luckymoney.exception.UserException;
import com.test.luckymoney.vo.User;
import org.springframework.stereotype.Service;

/**
 * Created by kui.jin ON 2019/12/13
 * 举例模仿异常 忽略实现类  正常要写实现类
 */
@Service
public class UserService {


    public User getUser(Integer age) throws Exception{
        User u = new User();
        if(age==null) return u;
        if(age<5)
            throw new UserException(ExceptionEnum.AGE_ERROR);
        if(age<18)
            throw new UserException(ExceptionEnum.MIN_AGE_ERROR);
        u.setName("jack");
        u.setAge(22);
        return u;
    }
}
