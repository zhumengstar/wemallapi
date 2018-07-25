package com.springbootmybatis.mapper;

import com.springbootmybatis.model.AccessoryEntity;

import java.rmi.AccessException;
import java.util.List;

public interface AccessoryMapper {
    List<AccessoryEntity> getAll();
    AccessoryEntity getOne(long id);
}
