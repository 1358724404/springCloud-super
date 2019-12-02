package com.fuhan.controller;

import com.fuhan.entity.Product;
import com.fuhan.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/30
 */
@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private IProductService productService;
    @Value("${server.port}")
    private String port;

    @RequestMapping("list")
    @ResponseBody
    public List<Product> getList(){
        System.out.println(port);
        return productService.getList();
    }
}
