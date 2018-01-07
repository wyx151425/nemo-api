package com.rumofuture.nemo.repository.cache;

import com.alibaba.fastjson.JSON;
import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.util.constant.NemoConst;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author  王振琦  2018/1/7
 */
@Repository(value = "bookCache")
public class BookCache {

    private static final String BOOK = NemoConst.BOOK + NemoConst.Cache.SEPARATOR;
    private static final int TIMEOUT = 3 * 60 * 60;

    @Autowired
    private NemoCache nemoCache;

    public void setOne(Book book) {
        String key = BOOK + book.getId();
        String value = JSON.toJSONString(book);
        nemoCache.set(key, value, TIMEOUT);
    }

    public Book getOne(Integer id) {
        String key = BOOK + id;
        String value = nemoCache.get(key);
        return JSON.parseObject(value, Book.class);
    }

    public Boolean deleteOne(Integer id) {
        String key = BOOK + id;
        return nemoCache.delete(key);
    }
}
