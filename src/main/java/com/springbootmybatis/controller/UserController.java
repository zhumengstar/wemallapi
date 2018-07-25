package com.springbootmybatis.controller;

import com.springbootmybatis.mapper.UserMapper;
import com.springbootmybatis.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//用户表
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper1;

    @RequestMapping("/getUsers")
    public List<UserEntity> getAll() {

        List<UserEntity> userMapper1s = userMapper1.getUsers();

        return userMapper1s;
    }
}
