package com.springbootmybatis.mapper;

import com.springbootmybatis.model.AlbumEntity;

import java.util.List;

public interface AlbumMapper {
    List<AlbumEntity> getAll();
    AlbumEntity getOne(Long id);
}
