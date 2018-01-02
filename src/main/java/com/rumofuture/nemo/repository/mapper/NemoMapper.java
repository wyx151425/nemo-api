package com.rumofuture.nemo.repository.mapper;

import com.rumofuture.nemo.model.entity.PageModel;

import java.util.List;

public interface NemoMapper<T, ID> {
    int insert(T object);
    int update(T object);
    int delete(ID id);
    T selectOne(ID id);
    List<T> selectList();
    List<T> selectList(PageModel pageModel);
}
