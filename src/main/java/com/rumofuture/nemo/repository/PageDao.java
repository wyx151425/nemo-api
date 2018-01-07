package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.Page;
import com.rumofuture.nemo.model.entity.PageModel;

import java.util.List;

/**
 * @author WangZhenqi 2018/1/7
 */
public interface PageDao extends NemoDao<Page, Integer> {
    /**
     * 根据漫画册查询漫画分页
     *
     * @param bookId 漫画册ID
     * @param pageModel 分页模型
     * @return 目标对象列表
     */
    List<Page> findAllByBook(Integer bookId, PageModel pageModel);
}
