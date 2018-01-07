package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.entity.PageModel;

import java.util.List;

/**
 * Dao接口规范
 *
 * @param <T>  目标对象类型
 * @param <ID> 目标对象id类型
 * @author 王振琦 2018/1/2
 */
public interface NemoDao<T, ID> {
    /**
     * 保存
     *
     * @param object 目标对象
     */
    void save(T object);

    /**
     * 更新
     *
     * @param object 目标对象
     */
    void update(T object);

    /**
     * 根据ID删除指定对象
     *
     * @param id 目标对象ID
     */
    void delete(ID id);

    /**
     * 根据ID查询指定对象
     *
     * @param id 目标对象ID
     * @return 目标对象
     */
    T findOne(ID id);

    /**
     * 分页获取对象列表
     *
     * @param pageModel 分页模型
     * @return 目标对象列表
     */
    List<T> findList(PageModel pageModel);
}
