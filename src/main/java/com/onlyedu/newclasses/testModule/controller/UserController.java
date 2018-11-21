package com.onlyedu.newclasses.testModule.controller;

import com.github.pagehelper.PageInfo;
import com.onlyedu.newclasses.model.User;
import com.onlyedu.newclasses.testModule.service.UserService;
import com.onlyedu.newclasses.util.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Andy
 * @date 2018/11/21 9:25
 */

@RestController
@RequestMapping("users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("user")
    public RestResult add(@RequestBody @Valid User user, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            RestResult.fail(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }

        int num = userService.addUser(user);

        if(num == 1){
            return RestResult.success(user);
        }else {
            return RestResult.fail("插入数据失败");
        }

    }


    @GetMapping("user")
    public RestResult getUser(@RequestParam(name = "pageNum", required = false, defaultValue = "1")
                                          int pageNum,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "5")
                                          int pageSize){

        PageInfo<User> pageInfo =  userService.findAllUser(pageNum,pageSize);
        return RestResult.success(pageInfo);
    }

}
