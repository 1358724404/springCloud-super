package com.fuhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/30
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class IndexServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(IndexServiceStart.class,args);
    }
}
