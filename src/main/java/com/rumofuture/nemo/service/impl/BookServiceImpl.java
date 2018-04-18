package com.rumofuture.nemo.service.impl;

import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.domain.User;
import com.rumofuture.nemo.model.entity.PageModel;
import com.rumofuture.nemo.repository.BookRepository;
import com.rumofuture.nemo.repository.UserRepository;
import com.rumofuture.nemo.service.BookService;
import com.rumofuture.nemo.util.constant.NemoConst;
import com.rumofuture.nemo.util.generator.Generator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(Book book) {
        book.setObjectId(Generator.getUUID());
        book.setStatus(1);
        book.setCreateAt(LocalDateTime.now().withNano(0));
        book.setUpdateAt(LocalDateTime.now().withNano(0));
        book.setPage(0);
        book.setFavor(0);
        bookRepository.save(book);
        // 更新用户的漫画册数目
        User user = book.getAuthor();
        int newBookTotal = user.getBook() + 1;
        user.setBook(newBookTotal);
        userRepository.update(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        bookRepository.delete(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
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
    public List<Book> findListByUser(Integer userId, Integer index, Boolean own) {
        PageModel pageModel = new PageModel(index, NemoConst.PageModel.Limit.BOOK);
        return bookRepository.findListByAuthor(userId, pageModel, own);
    }

    @Override
    public List<Book> findListByStyle(String style, Integer index) {
        PageModel pageModel = new PageModel(index, NemoConst.PageModel.Limit.BOOK);
        return bookRepository.findListByStyle(style, pageModel);
    }
}
