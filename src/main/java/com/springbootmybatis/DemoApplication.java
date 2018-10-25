package com.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
@Controller
@MapperScan("com.springbootmybatis.mapper")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String index(ModelMap map) {

        String local = "http://47.93.8.183:8081";
//39.107.108.40

        map.put("accessory1", local + "/accessory/getAccessories");
        map.put("accessory2", local + "/accessory/getOne/5");

        map.put("address1", local + "/address/getAddresses");
        map.put("address2", local + "/address/getOne/32770");

        map.put("album1", local+"/album/getAlbums");
        map.put("album2", local+"/album/getOne/5");

        map.put("area1", local+"/area/getAreas");
        map.put("area2", local+"/area/getOne/4521985");

        map.put("goodClass1", local+"/goodClass/getClasses");
        map.put("goodClass2", local+"/goodClass/getOne/3");

        map.put("user1", local+"/user/getUsers");
        map.put("user2", local+"/user/getOne/32768");

        return "hello";

    }


}
