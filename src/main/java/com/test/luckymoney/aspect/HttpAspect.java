package com.test.luckymoney.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by kui.jin ON 2019/12/13
 *
 *  AOP 切面
 */
@Aspect
@Component
public class HttpAspect {


    @Pointcut("execution(public * com.test.luckymoney.controller.IndexController.say(..))")
    public void interceptor(){};


    /*@Before("execution(public * com.test.luckymoney.controller.IndexController.*(..))")
    public void doBefect(){
        System.out.println("11111111111111111111");
    }

    @After("execution(public * com.test.luckymoney.controller.IndexController.*(..))")
    public void doAfter(){
        System.out.println("22222222222222222");
    }*/

    @Before("interceptor()")
    public void doBefect(){
        System.out.println("11111111111111111111");
    }

    @After("interceptor()")
    public void doAfter(){
        System.out.println("22222222222222222");
    }

}
