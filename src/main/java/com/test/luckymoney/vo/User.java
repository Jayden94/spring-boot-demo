package com.test.luckymoney.vo;

import javax.validation.constraints.Min;

/**
 * Created by kui.jin ON 2019/12/13
 */
public class User {
    private String name;
    @Min(value = 18,message = "未满18岁不能发红包")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
