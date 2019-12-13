package com.test.luckymoney.config;



import com.test.luckymoney.interceptor.OneInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;



/**
 * Created by kui.jin ON 2019/12/13
 * 拦截器
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器 可以添加多个  .addPathPatterns("/**"); 拦截所有
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/hello/say");
        super.addInterceptors(registry);
    }
}
