package com.springbootmybatis.controller;


import com.springbootmybatis.mapper.GoodsPhotoDao;
import com.springbootmybatis.model.GoodsPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/photo")
@CrossOrigin
public class GoodPhotoController {
    @Autowired
    GoodsPhotoDao goodsPhotoDao;

    @RequestMapping("/getAll")
    public List<GoodsPhoto>  getAll(){
        return  goodsPhotoDao.getAll();
    }

    @RequestMapping("/findByGoods_id/{id}")
    public List<GoodsPhoto> findByGoods_id(@PathVariable Long id){
        return goodsPhotoDao.findByGoods_id(id);
    }
}
