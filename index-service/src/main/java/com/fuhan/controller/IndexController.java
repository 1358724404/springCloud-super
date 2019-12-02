package com.fuhan.controller;

import com.fuhan.entity.Product;
import com.fuhan.feign.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/30
 */
@Controller
@RequestMapping("index")
public class IndexController {

    private  String PRODUCT_SERVICE_URL = "http://PRODUCT-SERVICE/product/list";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductService productService;

    @RequestMapping("show")
    public String show(Model model){
       // RestTemplate restTemplate = new RestTemplate();
        String list = restTemplate.getForObject(PRODUCT_SERVICE_URL,String.class);
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("show2")
    public String show2(Model model){
        // RestTemplate restTemplate = new RestTemplate();
        List<Product> list = productService.getList();
        model.addAttribute("list",list);
        return "index";
    }
}
