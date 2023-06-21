package com.yingzi.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yingzi
 * @Date: 2023/6/20 20:56
 * @Description
 * @Version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("/haha")
    public String hello(){
        return "Hello";
    }
}
