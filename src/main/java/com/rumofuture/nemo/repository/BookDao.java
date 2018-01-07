package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.entity.PageModel;

import java.util.List;

/**
 * 漫画册数据访问接口
 *
 * @author WangZhenqi 2018/1/7
 */
public interface BookDao extends NemoDao<Book, Integer> {
    /**
     * 根据漫画册作者获取漫画册
     *
     * @param authorId  漫画册作者ID
     * @param pageModel 分页模型
     * @return 目标对象列表
     */
    List<Book> findListByAuthor(Integer authorId, PageModel pageModel);
}
