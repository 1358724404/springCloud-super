package com.fuhan.feign;

import com.fuhan.entity.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/12/2
 */
@Component
public class ProductServiceFallBack implements ProductService {
    @Override
    public List<Product> getList() {
        System.out.println("进入熔断器");
        List<Product> list = new ArrayList<>(1);
        list.add(new Product(1,"熔断器",new BigDecimal(999)));
        return list;
    }
}
