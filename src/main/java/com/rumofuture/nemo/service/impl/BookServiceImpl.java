package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.repository.BookRepository;
import com.rumofuture.nemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Book book) {

    }
}
