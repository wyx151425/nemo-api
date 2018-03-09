package com.rumofuture.nemo.controller;

import com.rumofuture.nemo.context.exception.NemoException;
import com.rumofuture.nemo.model.domain.Book;
import com.rumofuture.nemo.model.entity.RequestBook;
import com.rumofuture.nemo.model.entity.Response;
import com.rumofuture.nemo.service.BookService;
import com.rumofuture.nemo.util.constant.RespStatus;
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

    @Autowired
    private BookService bookService;

    @PostMapping(value = "books")
    Response<Book> actionSaveBook(@RequestBody Book book) {
        bookService.save(book);
        try {
            bookService.save(book);
        } catch (Exception e) {
            throw new NemoException(RespStatus.SYSTEM_ERROR);
        }
    }

    @DeleteMapping(value = "books/{id}")
    Response<Book> actionDeleteBook(@PathVariable(value = "id") Integer id) {
        return new Response<>();
    }

    @PutMapping(value = "books/{id}")
    Response<Book> actionUpdateBook(@RequestBody Book book) {
        return new Response<>();
    }

    @GetMapping(value = "users/{id}/books")
    Response<Book> actionQueryBookListByAuthor(
            @PathVariable(value = "id") Integer id,
            @RequestParam(value = "index") Integer index
    ) {
        return new Response<>();
    }

    @GetMapping(value = "books")
    Response<List<Book>> actionQueryBookListByStyle(
            @RequestParam(value = "style") String style
    ) {
        return null;
    }
}
