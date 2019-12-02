package com.fuhan.service;

import com.fuhan.entity.Product;

import java.util.List;

public interface IProductService extends IBaseService<Product> {
    List<Product> getList();

}
