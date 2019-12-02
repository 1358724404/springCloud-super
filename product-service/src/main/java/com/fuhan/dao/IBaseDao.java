package com.fuhan.dao;

import com.fuhan.entity.Product;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/30
 */
public interface IBaseDao<T> {
    int deleteByPrimaryKey(Integer id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);
}
