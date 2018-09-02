package com.springbootmybatis.mapper;

import com.springbootmybatis.model.AddressEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AddressMapper {

    List<AddressEntity> getAllAddress();

    AddressEntity getOneAddress(Long id);

    Boolean addOneAddress(Map map);

    Boolean deleteAddress(Long id);

    Boolean updateAddress();
}
