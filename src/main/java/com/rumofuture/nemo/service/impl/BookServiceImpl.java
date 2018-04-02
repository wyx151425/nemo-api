package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.BookRepository;
import com.rumofuture.nemo.service.BookService;
import com.rumofuture.nemo.util.constant.RespStatus;
import com.rumofuture.nemo.util.generator.Generator;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.GenericArrayType;
import java.time.LocalDateTime;
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
        book.setObjectId(Generator.getUUID());
        book.setStatus(1);
        book.setCreateAt(LocalDateTime.now().withNano(0));
        book.setUpdateAt(LocalDateTime.now().withNano(0));
        book.setPage(0);
        book.setFavor(0);
        bookRepository.save(book);
    }

    @Override
    public void delete(Integer id) {
        bookRepository.delete(id);
    }

    @Override
    public void update(Book book) {
        book.setUpdateAt(LocalDateTime.now().withNano(0));
        book.setStatus(2);
        bookRepository.update(book);
    }

    @Override
    public Book findOne(Integer id) {
        return bookRepository.findOne(id);
    }

    @Override
    public List<Book> findListByUser(Integer userId, Integer pageIndex, Boolean own) {
        PageModel pageModel = new PageModel();
        pageModel.setIndex(pageIndex);
        pageModel.setLimit(32);
        return bookRepository.findListByAuthor(userId, pageModel, own);
    }

    @Override
    public List<Book> findListByStyle(String style, Integer pageIndex) {
        PageModel pageModel = new PageModel();
        pageModel.setIndex(pageIndex);
        pageModel.setLimit(32);
        return bookRepository.findListByStyle(style, pageModel);
    }
}
