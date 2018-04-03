package com.rumofuture.nemo.service;

import com.rumofuture.nemo.model.domain.Page;

import java.util.List;

/**
 * 漫画分页业务逻辑接口
 *
 * @author 王振琦  2018/1/7
 */
public interface PageService {
    /**
     * 保存方法
     * @param page 目标对象
     */
    void save(Page page);

    /**
     * 更新方法
     * @param page 目标对象
     */
    void update(Page page);

    /**
     * 删除方法
     *
     * @param id 目标对象的ID
     */
    void delete(Integer id);

    /**
     * 根据漫画册查询漫画分页
     * @param bookId  漫画册ID
     * @return 漫画册包含的漫画分页列表
     */
    List<Page> queryListByBook(Integer bookId, Integer index);
}
