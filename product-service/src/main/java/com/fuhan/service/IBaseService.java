package com.fuhan.service;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/11/30
 */
public interface IBaseService<T> {
    int deleteByPrimaryKey(Integer id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);
}
