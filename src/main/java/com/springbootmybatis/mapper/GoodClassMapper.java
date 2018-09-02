package com.springbootmybatis.mapper;

import com.springbootmybatis.model.GoodClassEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface GoodClassMapper {

    List<GoodClassEntity> getAll();

    GoodClassEntity getOne(Long id);

    Boolean insert(GoodClassEntity goodsclass);

    Boolean update(GoodClassEntity goodsclass);

    Boolean delete(Long id);

    List<GoodClassEntity> getGoodsAtoB(Map map);

    List<GoodClassEntity> getClassByClassName(@Param("classname") String classname);



}
