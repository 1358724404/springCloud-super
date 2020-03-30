package com.fuhan.feign;

import com.fuhan.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/30
 */
@FeignClient(name = "PRODUCT-SERVICE",fallback = ProductServiceFallBack.class)
public interface ProductService {
    @GetMapping("product/list")
    List<Product> getList();


}
