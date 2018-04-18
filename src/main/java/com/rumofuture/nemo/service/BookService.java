package com.rumofuture.nemo.service;

import com.rumofuture.nemo.model.domain.Book;

import java.util.List;

/**
 * 漫画册业务逻辑接口
 *
 * @author 王振琦  2018/1/7
 */
public interface BookService {
    void save(Book book);
    void delete(Integer id);
    void update(Book book);

    /**
     * 根据id查询指定漫画册
     * @param id 漫画册id
     * @return 根据id查询出的漫画册对象
     */
    Book findOne(Integer id);

    /**
     * 根据用户id查询漫画册列表
     * @param userId 用户id
     * @param index 分页索引
     * @return 查询结果-列表数据
     */
    List<Book> findListByUser(Integer userId, Integer index, Boolean own);

    /**
     * 根据风格查询漫画册列表
     *
     * @param style 漫画册风格
     * @param index 分页索引
     * @return 查询结果-列表数据
     */
    List<Book> findListByStyle(String style, Integer index);
}
