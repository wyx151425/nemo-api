package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.entity.PageModel;

import java.util.List;

public interface NemoDao<T, ID> {
    void save(T object);
    void update(T object);
    void delete(ID id);
    T findOne(ID id);
    List<T> findAll();
    List<T> findAll(PageModel pageModel);
}
