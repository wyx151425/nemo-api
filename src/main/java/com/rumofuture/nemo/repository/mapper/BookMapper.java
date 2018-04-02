package com.rumofuture.nemo.repository.mapper;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.entity.PageModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 漫画册数据映射
 *
 * @author 王振琦  2018/1/7
 */
@Mapper
@Repository(value = "bookMapper")
public interface BookMapper extends NemoMapper<Book, Integer> {
    /**
     * 根据作者ID查询漫画册
     *
     * @param authorId  作者id
     * @param pageModel 分页对象
     * @return 目标对象
     */
    List<Book> selectListByAuthor(
            @Param("authorId") Integer authorId,
            @Param("page") PageModel pageModel
    );

    /**
     * 根据漫画册风格查询漫画册
     *
     * @param style 风格
     * @param pageModel 分页对象
     * @return 目标对象
     */
    List<Book> selectListByStyle(
            @Param("style") String style,
            @Param("page") PageModel pageModel
    );
}
