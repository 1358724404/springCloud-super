package com.fuhan.mapper;

import com.fuhan.dao.IBaseDao;
import com.fuhan.entity.Product;

import java.util.List;

public interface ProductMapper extends IBaseDao<Product> {

    List<Product> getList();

}