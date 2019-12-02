package com.fuhan.service.impl;

import com.fuhan.dao.IBaseDao;
import com.fuhan.entity.Product;
import com.fuhan.mapper.ProductMapper;
import com.fuhan.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/30
 */
@Service
public class ProductServiceImpl extends BaseServiceImpl<Product> implements IProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public IBaseDao<Product> getDao() {
        return productMapper;
    }

    @Override
    public List<Product> getList() {
        return productMapper.getList();
    }
}
