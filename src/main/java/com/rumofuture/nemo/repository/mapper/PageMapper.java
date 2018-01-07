package com.rumofuture.nemo.repository.mapper;

import com.rumofuture.nemo.model.domain.Page;
import com.rumofuture.nemo.model.entity.PageModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author WangZhenqi
 */
public interface PageMapper extends NemoMapper<Page, Integer> {
    /**
     * 根据漫画册查询漫画分页
     *
     * @param bookId    漫画册ID
     * @param pageModel 分页模型
     * @return 目标对象列表
     */
    List<Page> selectListByBook(
            @Param("bookId") Integer bookId,
            @Param("page") PageModel pageModel
    );
}
