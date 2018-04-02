package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.BookRepository;
import com.rumofuture.nemo.service.BookService;
import com.rumofuture.nemo.util.constant.RespStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 漫画册业务逻辑接口实现类
 *
 * @author 王振琦  2018/1/7
 */
@Service(value = "bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.delete(id);
    }

    @Override
    public void update(Book book) {
        bookRepository.update(book);
    }

    @Override
    public Book findOne(Integer id) {
        return bookRepository.findOne(id);
    }

    @Override
    public List<Book> findListByUser(Integer userId, Integer pageIndex) {
        PageModel pageModel = new PageModel();
        pageModel.setIndex(pageIndex);
        pageModel.setLimit(32);
        return bookRepository.findListByAuthor(userId, pageModel);
    }

    @Override
    public List<Book> findListByStyle(String style, Integer pageIndex) {
        PageModel pageModel = new PageModel();
        pageModel.setIndex(pageIndex);
        pageModel.setLimit(32);
        return bookRepository.findListByStyle(style, pageModel);
    }
}
