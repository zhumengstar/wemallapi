package com.springbootmybatis.controller;

import com.springbootmybatis.mapper.UserMapper;
import com.springbootmybatis.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//用户表
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/getUsers")
    public List<UserEntity> getAll() {
        return userMapper.getAll();
    }

    @RequestMapping("/getOne/{id}")
    public UserEntity getOne(@PathVariable long id){
        return userMapper.getOne(id);
    }
}
