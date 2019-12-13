package com.test.luckymoney.controller;

import com.test.luckymoney.config.LimitConfig;
import com.test.luckymoney.service.UserService;
import com.test.luckymoney.utils.ResultUtil;
import com.test.luckymoney.vo.Result;
import com.test.luckymoney.vo.User;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by kui.jin ON 2019/12/2
 */
@Controller
@RequestMapping("/hello")
public class IndexController {

    @Autowired
    private UserService userService;

    @Autowired
    private LimitConfig limitConfig;

    @Value("${limit.description}")
    private String description;

    @GetMapping("/say")
    @ResponseBody
    public String say() {
        //获取配置中数据
        return "maxMoney："+limitConfig.getMaxMoney()+",description:"+description;
    }

    //返回模板
    @GetMapping("/index")
    public String index() {
        //返回页面
        return "index";
    }

    //抛出异常有全局异常处理 最后返回还是标准格式 code msg  data
    @GetMapping("getUser/{age}")
    @ResponseBody
    public Result<User> getUser(@PathVariable("age")Integer age) throws Exception{
        User user = userService.getUser(age);
        return ResultUtil.success(user);
    }




    @PostMapping("/save")
    @ResponseBody
    public Result<User> saveUser(@Valid User user, BindingResult bindingResult) throws Exception{
        if(bindingResult.hasErrors()){
            //有错误 抛出
            throw  new Exception(bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(user);
    }

}
