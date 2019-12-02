package com.fuhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/30
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
public class EurekaServerStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerStart.class,args);
    }
}
