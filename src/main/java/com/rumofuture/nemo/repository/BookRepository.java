package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.cache.BookCache;
import com.rumofuture.nemo.repository.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author WangZhenqi 2018/1/7
 */
public class BookRepository implements BookDao {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookCache bookCache;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(Book book) {
        bookMapper.insert(book);
        bookCache.setOne(book);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(Book book) {
        bookMapper.update(book);
        bookCache.deleteOne(book.getId());
        bookCache.setOne(book);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        bookMapper.delete(id);
        bookCache.deleteOne(id);
    }

    @Override
    public Book findOne(Integer id) {
        Book book = bookCache.getOne(id);
        if (null == book) {
            return bookMapper.selectOne(id);
        }
        return book;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findAll(PageModel pageModel) {
        return null;
    }
}
