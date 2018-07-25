package com.springbootmybatis.controller;

import com.springbootmybatis.mapper.AlbumMapper;
import com.springbootmybatis.model.AlbumEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//相册表
@RequestMapping("/album")
@RestController
public class AlbumController {

    @Autowired
    AlbumMapper albumMapper;

    @RequestMapping("/getAlbums")
    public List<AlbumEntity> getAll() {
        return albumMapper.getAll();
    }

    @RequestMapping("/getOne/{id}")
    public AlbumEntity getOne(@PathVariable long id) {
        return albumMapper.getOne(id);
    }
}
