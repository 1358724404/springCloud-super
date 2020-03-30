package com.fuhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/12/4
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinServerStart {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerStart.class,args);
    }
}
