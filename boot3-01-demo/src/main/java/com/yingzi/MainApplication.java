package com.yingzi;

import ch.qos.logback.classic.spi.EventArgUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Author: yingzi
 * @Date: 2023/6/19 21:29
 * @Description
 * @Version 1.0
 */
//@SpringBootApplication(scanBasePackages = "com.yingzi") //这是一个SpringBoot应用

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.yingzi")

public class MainApplication {

    public static void main(String[] args) {

        //java10: 局部变量类型的自动推断
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApplication.class, args);

        //1、获取容器中所有组件的名字
        String[] names = ioc.getBeanDefinitionNames();
        //2、挨个遍历
        // dispatcherServlet、beanNameViewResolver、characterEncodingFilter、multipartResolver
        // SpringBoot把以前配置的核心组件现在都给我们自动配置好了。
        for (String name : names) {
            System.out.println(name);
        }
    }
}
