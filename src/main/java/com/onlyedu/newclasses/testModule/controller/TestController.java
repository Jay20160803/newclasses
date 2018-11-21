package com.onlyedu.newclasses.testModule.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andy
 * @date 2018/11/20 13:52
 */

@RestController
public class TestController {


    @RequestMapping("")
    public String index(){
        return "后台项目";
    }
}
