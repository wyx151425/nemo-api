package com.rumofuture.nemo.service;

import com.rumofuture.nemo.model.domain.Book;

/**
 * 漫画册业务逻辑接口
 *
 * @author 王振琦  2018/1/7
 */
public interface BookService {
    void save(Book book);
    void delete(Integer id);
    void update(Book book);
}
