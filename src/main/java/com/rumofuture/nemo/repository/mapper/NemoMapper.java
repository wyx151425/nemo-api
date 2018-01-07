package com.rumofuture.nemo.repository.mapper;

import com.rumofuture.nemo.model.entity.PageModel;

import java.util.List;

/**
 * @param <T>  目标对象的类型
 * @param <ID> 目标对象的ID类型
 * @author WangZhenqi
 */
public interface NemoMapper<T, ID> {
    /**
     * 保存对象
     *
     * @param object 目标对象
     * @return 操作影响的行数
     */
    int insert(T object);

    /**
     * 更新对象
     *
     * @param object 目标对象
     * @return 操作影响的行数
     */
    int update(T object);

    /**
     * 根据ID删除对象
     *
     * @param id 目标对象ID
     * @return 操作影响的行数
     */
    int delete(ID id);

    /**
     * 根据ID查询对象
     *
     * @param id 目标对象ID
     * @return 目标对象
     */
    T selectOne(ID id);

    /**
     * 查询数据列表
     *
     * @return 操作影响的行数
     */
    List<T> selectList();

    /**
     * 分页查询数据列表
     *
     * @param pageModel 分页对象
     * @return 操作影响的行数
     */
    List<T> selectList(PageModel pageModel);
}
