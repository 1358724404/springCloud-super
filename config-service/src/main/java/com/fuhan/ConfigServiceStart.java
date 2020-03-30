package com.fuhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/12/3
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceStart.class,args);
    }
}
