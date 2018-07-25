package com.springbootmybatis.mapper;

import com.springbootmybatis.model.AddressEntity;

import java.util.List;
import java.util.Map;

public interface AddressMapper {

    List<AddressEntity> getAllAddress();

    AddressEntity getOneAddress(long id);

    Boolean addOneAddress(Map map);

    Boolean deleteAddress(long id);

    Boolean updateAddress();
}
