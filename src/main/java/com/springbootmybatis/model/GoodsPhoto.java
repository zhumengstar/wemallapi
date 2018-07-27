package com.springbootmybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "wemall_goods_photo")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsPhoto {
    @Id
    @GeneratedValue
    private Long goods_id;
    private Long photo_id;
}
