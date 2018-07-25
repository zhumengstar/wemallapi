package com.springbootmybatis.controller;


import com.springbootmybatis.mapper.AreaMapper;
import com.springbootmybatis.model.AreaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//地区表
@RequestMapping("/area")
@RestController
public class AreaController {
    @Autowired
    AreaMapper areaMapper;

    @RequestMapping("/getAreas")
    public List<AreaEntity> getAll(){

        return areaMapper.getAll();
    }

    @RequestMapping("/getOne/{id}")
    public AreaEntity getOne(@PathVariable long id){
        return areaMapper.getOne(id);
    }

}
