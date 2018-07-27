package com.springbootmybatis.mapper;

import com.springbootmybatis.model.GoodsPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsPhotoDao extends JpaRepository<GoodsPhoto,Long> {
    @Query("select g from GoodsPhoto g where g.goods_id=?1")
    List<GoodsPhoto> findByGoods_id(Long goods_id);

    @Query("select g from GoodsPhoto g")
    List<GoodsPhoto> getAll();
}
