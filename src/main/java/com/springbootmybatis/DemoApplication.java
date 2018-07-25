package com.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
@MapperScan("com.springbootmybatis.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
//39.107.108.40

        map.put("accessory1", "http://39.107.108.40:8081/accessory/getAccessories");
        map.put("accessory2", "http://39.107.108.40:8081/accessory/getOne/5");

        map.put("address1", "http://39.107.108.40:8081/address/getAddresses");
        map.put("address2", "http://39.107.108.40:8081/address/getOne/32770");

        map.put("album1","http://39.107.108.40:8081/album/getAlbums");
        map.put("album2","http://39.107.108.40:8081/album/getOne/5");

        map.put("area1","http://39.107.108.40:8081/area/getAreas");
        map.put("area2","http://39.107.108.40:8081/area/getOne/4521985");

        map.put("goodClass1","http://39.107.108.40:8081/goodClass/getClasses");
        map.put("goodClass2","http://39.107.108.40:8081/goodClass/getOne/3");

        map.put("user1","http://39.107.108.40:8081/user/getUsers");
        map.put("user2","http://39.107.108.40:8081/user/getOne/32768");

        return "hello";

    }

}
