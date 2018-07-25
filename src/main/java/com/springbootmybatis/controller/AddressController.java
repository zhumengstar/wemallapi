package com.springbootmybatis.controller;

import com.springbootmybatis.mapper.AddressMapper;
import com.springbootmybatis.model.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//地址表
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    public AddressMapper addressMapper;

    @RequestMapping(value = "/getAddresses",produces = "application/json")
    public List<AddressEntity> getAllAddress() {
        return addressMapper.getAllAddress();
    }

    @RequestMapping(value = "/getOne/{id}",produces = "application/json")
    public AddressEntity getAllAddress(@PathVariable long id) {
        return addressMapper.getOneAddress(id);
    }

    @RequestMapping("/insertOne/{deleteStatus}/{area_info}/{mobile}/{telephone}/{trueName}/{zip}")
    public Boolean addOneAddress(@PathVariable Boolean deleteStatus,@PathVariable String area_info, @PathVariable String mobile, @PathVariable String telephone, @PathVariable String trueName, @PathVariable String zip
                                 ) {
        Map<Object,Object> map=new HashMap<>();
        map.put("deleteStatus",deleteStatus);
        map.put("area_info",area_info);
        map.put("mobile",mobile);
        map.put("telephone",telephone);
        map.put("trueName",trueName);
        map.put("zip",zip);
        return addressMapper.addOneAddress(map);
    }

    @RequestMapping("/deleteOne/{id}")
    public Boolean deleteAddress(@PathVariable Long id){
        return addressMapper.deleteAddress(id);
    }
}
