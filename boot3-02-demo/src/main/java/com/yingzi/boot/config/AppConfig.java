package com.yingzi.boot.config;

import com.alibaba.druid.FastsqlException;
import com.yingzi.boot.bean.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * @Author: yingzi
 * @Date: 2023/6/20 21:45
 * @Description
 * @Version 1.0
 */
@Import(FastsqlException.class)
@SpringBootApplication// 这是一个配置类,替代以前的配置文件。配置类本身也是容器中的组件
//@Configuration
public class AppConfig {

    /**
     * 1、组件默认是单实例的
     * @return
     */
    @Scope("prototype")
    @Bean("userHaha") // 替代以前的Bean标签，组件在容器中的名字默认时方法名，可以直接修改注解的值
    public User user(){
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }


    @Bean
    public FastsqlException fastsqlException(){
        return new FastsqlException();
    }
}
