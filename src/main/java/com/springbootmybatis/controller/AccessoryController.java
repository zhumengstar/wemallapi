package com.springbootmybatis.controller;

import com.springbootmybatis.mapper.AccessoryMapper;
import com.springbootmybatis.model.AccessoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//附件表
@RequestMapping("/accessory")
@RestController
public class AccessoryController {
    @Autowired
    AccessoryMapper accessoryMapper;


    @RequestMapping("/getAccessories")
    public List<AccessoryEntity> getAll(){
        return accessoryMapper.getAll();
    }

    @RequestMapping("/getAccessory/{id}")
    public AccessoryEntity getOne(@PathVariable long id){
        return accessoryMapper.getOne(id);
    }


}
