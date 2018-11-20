package com.onlyedu.newclasses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andy
 * @date 2018/11/20 13:52
 */

@RestController
public class TestController {


    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("onlyedu/test")
    public String test(){
        return (String) redisTemplate.opsForValue().get("aa");
    }

    @RequestMapping("")
    public String index(){
        return "后台项目";
    }
}
