package com.fuhan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/12/4
 */
@Controller
@RequestMapping("config")
@RefreshScope
public class ConfigController {

    @Value("${image.server}")
    private String imageServer;

    @RequestMapping("imageServer")
    @ResponseBody
    public String getImageServer(){

        return imageServer;
    }
}
