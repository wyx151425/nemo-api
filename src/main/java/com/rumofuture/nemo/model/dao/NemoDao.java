package com.rumofuture.nemo.model.dao;

import java.util.List;

public interface NemoDao<T, ID> {
    int save(T object);
    int update(T object);
    int delete(ID id);
    T findOne(ID id);
    List<T> findAll();
    List<T> findAll(int pageCode, int pageSize);
}
