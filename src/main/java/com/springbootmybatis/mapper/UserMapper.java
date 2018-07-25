package com.springbootmybatis.mapper;

import com.springbootmybatis.model.UserEntity;

import java.util.List;

public interface UserMapper {
    List<UserEntity> getUsers();

    UserEntity getOne(long id);
}
