package com.test.luckymoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//配置sql 删除exclude
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LuckymoneyApplication {




    public static void main(String[] args) {
        SpringApplication.run(LuckymoneyApplication.class, args);
    }

}
