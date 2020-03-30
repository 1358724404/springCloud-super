package com.fuhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/12/4
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientStart.class,args);
    }
}
