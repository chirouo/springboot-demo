package com.gx.springboo2_demo.controller;


import com.gx.springboo2_demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController()
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/{id}")
    public String queryUserNameById(@PathVariable("id") Integer id){
        return userService.getById(id).toString();
    }
}

