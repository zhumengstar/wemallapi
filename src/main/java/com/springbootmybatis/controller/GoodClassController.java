package com.springbootmybatis.controller;


import com.springbootmybatis.mapper.GoodClassMapper;
import com.springbootmybatis.model.GoodClassEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//商品分类表
@RestController
@RequestMapping("/goodClass")
public class GoodClassController {

    @Autowired
    GoodClassMapper wemall_goodsclassMapper;

    @RequestMapping("/getClasses")
    public List<GoodClassEntity> getAll() {
        List<GoodClassEntity> wemall=wemall_goodsclassMapper.getAll();
        return wemall;
    }

    @RequestMapping("/getOne/{id}")
    public GoodClassEntity getOne(@PathVariable Long id) {
        GoodClassEntity wemall=wemall_goodsclassMapper.getOne(id);
        return wemall;
    }

    @RequestMapping("/deleteOne/{id}")
    public Boolean delete(@PathVariable Long id){
        return wemall_goodsclassMapper.delete(id);
    }

    @RequestMapping("/getGoodsAtoB/{id1}/{id2}")
    public List<GoodClassEntity> getGoodsAtoB(@PathVariable Long id1, @PathVariable Long id2){
        Map<String ,Object> map=new HashMap<>();
        map.put("id1",id1);
        map.put("id2",id2);
        return wemall_goodsclassMapper.getGoodsAtoB(map);
    }

    @RequestMapping("/getGoodClassByName/{className}")
    public List<GoodClassEntity> getGoodsClass(@PathVariable String className){
       return wemall_goodsclassMapper.getClassByClassName(className);
    }
}
