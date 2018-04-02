package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.entity.RequestBook;
import com.rumofuture.nemo.model.entity.Response;
import com.rumofuture.nemo.service.BookService;
import com.rumofuture.nemo.util.constant.RespStatus;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 漫画册数据API
 *
 * @author 王振琦  2018/1/7
 */
@RestController
public class BookController extends NemoController {

    private static final Log log = LogFactory.getLog(UserController.class);

    @Autowired
    private BookService bookService;

    @PostMapping(value = "books")
    Response<Book> actionSaveBook(@RequestBody Book book) {
        try {
            bookService.save(book);
            return new Response<>(book);
        } catch (Exception e) {
            throw new NemoException(RespStatus.SYSTEM_ERROR);
        }
    }

    @DeleteMapping(value = "books/{id}")
    Response<Book> actionDeleteBook(@PathVariable(value = "id") Integer id) {
        try {
            bookService.delete(id);
            return new Response<>(RespStatus.SUCCESS);
        } catch (Exception e) {
            throw new NemoException(RespStatus.DELETE_FAILED);
        }
    }

    @PutMapping(value = "books")
    Response<Book> actionUpdateBook(@RequestBody Book book) {
        try {
            bookService.update(book);
            return new Response<>(RespStatus.SUCCESS);
        } catch (Exception e) {
            throw new NemoException(RespStatus.UPDATE_FAILED);
        }
    }

    @GetMapping(value = "users/{id}/books")
    Response<List<Book>> actionQueryBookListByAuthor(
            @PathVariable(value = "id") Integer id,
            @RequestParam(value = "index") Integer index
    ) {
        try {
            List<Book> bookList = bookService.findListByUser(id, index);
            return new Response<>(bookList);
        } catch (Exception e) {
            throw new NemoException(RespStatus.QUERY_FAILED);
        }
    }

    @GetMapping(value = "books")
    Response<List<Book>> actionQueryBookListByStyle(
            @RequestParam(value = "style") String style,
            @RequestParam(value = "index") Integer index
    ) {
        try {
            List<Book> bookList = bookService.findListByStyle(style, index);
            return new Response<>(bookList);
        } catch (Exception e) {
            log.error("BookController: actionQueryBookListByStyle", e);
            throw new NemoException(RespStatus.QUERY_FAILED);
        }
    }
}
