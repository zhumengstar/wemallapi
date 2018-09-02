package com.springbootmybatis.mapper;

import com.springbootmybatis.model.AreaEntity;

import java.util.List;

public interface AreaMapper {
    List<AreaEntity> getAll();

    AreaEntity getOne(Long id);

}
