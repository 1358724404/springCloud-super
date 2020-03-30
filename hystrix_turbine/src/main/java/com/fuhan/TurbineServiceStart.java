package com.fuhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/12/2
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class TurbineServiceStart {
    public static void main(String[] args) {
        SpringApplication.run(TurbineServiceStart.class,args);
    }
}
