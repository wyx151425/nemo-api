package com.rumofuture.nemo.repository;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.cache.BookCache;
import com.rumofuture.nemo.repository.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 漫画册数据访问接口实现类
 *
 * @author 王振琦 2018/1/7
 */
@Repository(value = "bookRepository")
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
    public List<Book> findList(PageModel pageModel) {
        return null;
    }

    @Override
    public List<Book> findListByAuthor(Integer authorId, PageModel pageModel) {
        return bookMapper.selectListByAuthor(authorId, pageModel);
    }

    @Override
    public List<Book> findListByStyle(String style, PageModel pageModel) {
        return bookMapper.selectListByStyle(style, pageModel);
    }
}
