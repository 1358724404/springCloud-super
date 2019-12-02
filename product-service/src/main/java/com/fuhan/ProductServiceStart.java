package com.fuhan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/30
 */
@SpringBootApplication
@MapperScan("com.fuhan.mapper")
@EnableEurekaClient
public class ProductServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceStart.class,args);
    }
}
